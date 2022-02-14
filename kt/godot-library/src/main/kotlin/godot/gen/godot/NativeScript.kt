// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.StringName
import godot.core.TransferContext
import godot.core.VariantType.ANY
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class NativeScript : Script() {
  public open var className: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_CLASS_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_SET_CLASS_NAME, NIL)
    }

  public open var library: GDNativeLibrary?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_LIBRARY, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as GDNativeLibrary?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_SET_LIBRARY, NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public open var scriptClassName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_SCRIPT_CLASS_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_SET_SCRIPT_CLASS_NAME, NIL)
    }

  public open var scriptClassIconPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_SCRIPT_CLASS_ICON_PATH, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_SET_SCRIPT_CLASS_ICON_PATH, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_NATIVESCRIPT)
  }

  public open fun getClassDocumentation(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_CLASS_DOCUMENTATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun getMethodDocumentation(method: StringName): String {
    TransferContext.writeArguments(STRING_NAME to method)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_METHOD_DOCUMENTATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun getSignalDocumentation(signalName: StringName): String {
    TransferContext.writeArguments(STRING_NAME to signalName)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_SIGNAL_DOCUMENTATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun getPropertyDocumentation(path: StringName): String {
    TransferContext.writeArguments(STRING_NAME to path)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_GET_PROPERTY_DOCUMENTATION, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public open fun new(vararg __var_args: Any?): Any? {
    TransferContext.writeArguments( *__var_args.map { ANY to it }.toTypedArray())
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NATIVESCRIPT_NEW, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public companion object
}
