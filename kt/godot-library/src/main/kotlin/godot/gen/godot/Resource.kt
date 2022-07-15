// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType._RID
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for all resources.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/best_practices/node_alternatives.html]($DOCS_URL/tutorials/best_practices/node_alternatives.html)
 *
 * Resource is the base class for all Godot-specific resource types, serving primarily as data containers. Since they inherit from [godot.RefCounted], resources are reference-counted and freed when no longer in use. They are also cached once loaded from disk, so that any further attempts to load a resource from a given path will return the same reference (all this in contrast to a [godot.Node], which is not reference-counted and can be instantiated from disk as many times as desired). Resources can be saved externally on disk or bundled into another object, such as a [godot.Node] or another resource.
 *
 * **Note:** In C#, resources will not be freed instantly after they are no longer in use. Instead, garbage collection will run periodically and will free resources that are no longer in use. This means that unused resources will linger on for a while before being removed.
 */
@GodotBaseType
public open class Resource : RefCounted() {
  /**
   *
   */
  public val setupLocalToSceneRequested: Signal0 by signal()

  /**
   * Emitted whenever the resource changes.
   *
   * **Note:** This signal is not emitted automatically for custom resources, which means that you need to create a setter and emit the signal yourself.
   */
  public val changed: Signal0 by signal()

  /**
   * If `true`, the resource will be made unique in each instance of its local scene. It can thus be modified in a scene instance without impacting other instances of that same scene.
   */
  public var resourceLocalToScene: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_IS_LOCAL_TO_SCENE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_LOCAL_TO_SCENE, NIL)
    }

  /**
   * The path to the resource. In case it has its own file, it will return its filepath. If it's tied to the scene, it will return the scene's path, followed by the resource's index.
   */
  public var resourcePath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_PATH, NIL)
    }

  /**
   * The name of the resource. This is an optional identifier. If [resourceName] is not empty, its value will be displayed to represent the current resource in the editor inspector. For built-in scripts, the [resourceName] will be displayed as the tab name in the script editor.
   */
  public var resourceName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_NAME, STRING_NAME)
      return TransferContext.readReturnValue(STRING_NAME, false) as StringName
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SET_NAME, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_RESOURCE)
  }

  /**
   * Sets the path of the resource, potentially overriding an existing cache entry for this path. This differs from setting [resourcePath], as the latter would error out if another resource was already cached for the given path.
   */
  public fun takeOverPath(path: String): Unit {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_TAKE_OVER_PATH, NIL)
  }

  /**
   * Returns the RID of the resource (or an empty RID). Many resources (such as [godot.Texture2D], [godot.Mesh], etc) are high-level abstractions of resources stored in a server, so this function will return the original RID.
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * If [resourceLocalToScene] is enabled and the resource was loaded from a [godot.PackedScene] instantiation, returns the local scene where this resource's unique copy is in use. Otherwise, returns `null`.
   */
  public fun getLocalScene(): Node? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_GET_LOCAL_SCENE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Node?
  }

  /**
   * This method is called when a resource with [resourceLocalToScene] enabled is loaded from a [godot.PackedScene] instantiation. Its behavior can be customized by connecting [setupLocalToSceneRequested] from script.
   *
   * For most resources, this method performs no base logic. [godot.ViewportTexture] performs custom logic to properly set the proxy texture and flags in the local viewport.
   */
  public fun setupLocalToScene(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_SETUP_LOCAL_TO_SCENE, NIL)
  }

  /**
   * Emits the [changed] signal.
   *
   * If external objects which depend on this resource should be updated, this method must be called manually whenever the state of this resource has changed (such as modification of properties).
   *
   * The method is equivalent to:
   *
   * ```
   * 				emit_signal("changed")
   * 				```
   *
   * **Note:** This method is called automatically for built-in resources.
   */
  public fun emitChanged(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_EMIT_CHANGED, NIL)
  }

  /**
   * Duplicates the resource, returning a new resource with the exported members copied. **Note:** To duplicate the resource the constructor is called without arguments. This method will error when the constructor doesn't have default values.
   *
   * By default, sub-resources are shared between resource copies for efficiency. This can be changed by passing `true` to the `subresources` argument which will copy the subresources.
   *
   * **Note:** If `subresources` is `true`, this method will only perform a shallow copy. Nested resources within subresources will not be duplicated and will still be shared.
   *
   * **Note:** When duplicating a resource, only `export`ed properties are copied. Other properties will be set to their default value in the new resource.
   */
  public fun duplicate(subresources: Boolean = false): Resource? {
    TransferContext.writeArguments(BOOL to subresources)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_RESOURCE_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Resource?
  }

  public companion object
}
