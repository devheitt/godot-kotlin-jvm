#include "kotlin_binding_manager.h"
#include "modules/kotlin_jvm/src/logging.h"

GDNativeInstanceBindingCallbacks KotlinBindingManager::_instance_binding_callbacks = {
        &_instance_binding_create_callback,
        &_instance_binding_free_callback,
        &_instance_binding_reference_callback
};

void* KotlinBindingManager::_instance_binding_create_callback(void* p_token, void* p_instance) {
    KotlinBindingManager& manager = get_instance();
    Object* owner = reinterpret_cast<Object*>(p_instance);

    manager.spin.lock();
    KotlinBinding* binding = &manager.binding_map.insert(owner, KotlinBinding())->value;
    manager.spin.unlock();

    binding->owner = owner;
    return reinterpret_cast<void*>(binding);
}

void KotlinBindingManager::_instance_binding_free_callback(void* p_token, void* p_instance, void* p_binding) {
    //Called in the destructor of the Object.
    // It's the very last action done in the destructor so assume variables local to the Object have been cleaned (including script and extension).
    //There are 2 cases, either an Object has been freed, and we have to release its reference OR it's a Refcounted and the JVM instance is already dead.
    KotlinBinding* binding = reinterpret_cast<KotlinBinding*>(p_binding);
    KotlinBindingManager& manager = get_instance();

    if (binding->is_setup) {
        //Destructor of KtObject is taking care of releasing the reference.
        delete binding->kt_object;
    }

    Object* owner = reinterpret_cast<Object*>(p_instance);
    //We avoid concurrent modification of the map. Before that it should be safe as the destructor of an object is not supposed to be called multiple times.
    manager.spin.lock();
    manager.binding_map.erase(owner);
    manager.spin.unlock();
}

GDNativeBool
KotlinBindingManager::_instance_binding_reference_callback(void* p_token, void* p_binding, GDNativeBool p_reference) {
    //Called when a RefCounted is referenced or unreferenced.
    //Also called in the context of a mutex lock specific to the Object.
    KotlinBinding* binding = reinterpret_cast<KotlinBinding*>(p_binding);

    // True ==> counter increased, False ==> counter decreased
    if (p_reference) {
        binding->refcount_incremented_unsafe();
        return false;
    } else {
        binding->refcount_decremented_unsafe();
    }
}

void KotlinBindingManager::set_instance_binding(Object* p_object, KtObject* ktObject) {
    //Godot being weird. Call this function only if the JVM is the creator of the object, otherwise it will crash in case the object has any other bindings.
    //If not the creator (When you want to bind an existing object to JVM), use get_instance_binding instead.
    KotlinBindingManager& manager = get_instance();

    manager.spin.lock();
    KotlinBinding* binding = &manager.binding_map.insert(p_object, KotlinBinding())->value;
    manager.spin.unlock();

    binding->owner = p_object;
    binding->kt_object = ktObject;
    binding->is_setup = true;
    p_object->set_instance_binding(&get_instance(), binding, &_instance_binding_callbacks);
}

KotlinBinding* KotlinBindingManager::get_instance_binding(Object* p_object) {
    //Godot being weird but this is how you create a binding if it doesn't exist already, otherwise just retrieve it.
    // Use this function to bind an existing object to the JVM, the callbacks provided will handle the creation of the binding.
    KotlinBindingManager& manager = get_instance();
    manager.spin.lock();
    KotlinBinding* binding = &manager.binding_map.find(p_object)->value;
    manager.spin.unlock();
    if (binding) {
        return binding;
    }
    return static_cast<KotlinBinding*>(p_object->get_instance_binding(&get_instance(), &_instance_binding_callbacks));
}

KotlinBinding* KotlinBindingManager::create_script_binding(Object* p_object, KtObject* ktObject) {
    KotlinBindingManager& manager = get_instance();

    //We avoid concurrent modification of the map.
    manager.spin.lock();
    KotlinBinding* binding = &manager.binding_map.insert(p_object, KotlinBinding())->value;
    manager.spin.unlock();

    binding->owner = p_object;
    binding->kt_object = ktObject;
    binding->is_setup = true;
}

void KotlinBindingManager::delete_script_binding(KotlinInstance* instance) {
    KotlinBindingManager& manager = get_instance();
    //We avoid concurrent modification of the map. Before that it should be safe as the destructor of an object is not supposed to be called multiple times.
    manager.spin.lock();
    manager.binding_map.erase(instance->get_owner());
    manager.spin.unlock();
}

}

KotlinBindingManager& KotlinBindingManager::get_instance() {
    static KotlinBindingManager instance;
    return instance;
}

KotlinBindingManager::KotlinBindingManager() :
        binding_map(), spin() {
}