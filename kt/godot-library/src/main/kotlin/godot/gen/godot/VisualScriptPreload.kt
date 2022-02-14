// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class VisualScriptPreload : VisualScriptNode() {
  public open var resource: Resource?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPRELOAD_GET_RESOURCE,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Resource?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_VISUALSCRIPTPRELOAD_SET_RESOURCE,
          NIL)
      return TransferContext.readReturnValue(NIL, true) as Unit?
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSCRIPTPRELOAD)
  }

  public companion object
}
