// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A node that controls how the object faces the camera to be used within the visual shader graph.
 *
 * The output port of this node needs to be connected to `Model View Matrix` port of [godot.VisualShaderNodeOutput].
 */
@GodotBaseType
public open class VisualShaderNodeBillboard : VisualShaderNode() {
  /**
   * Controls how the object faces the camera. See [enum BillboardType].
   */
  public open var billboardType: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEBILLBOARD_GET_BILLBOARD_TYPE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEBILLBOARD_SET_BILLBOARD_TYPE, NIL)
    }

  /**
   * If `true`, the shader will keep the scale set for the mesh. Otherwise, the scale is lost when billboarding.
   */
  public open var keepScale: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEBILLBOARD_GET_KEEP_SCALE, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEBILLBOARD_SET_KEEP_SCALE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEBILLBOARD)
  }

  public enum class BillboardType(
    id: Long
  ) {
    /**
     * Billboarding is disabled and the node does nothing.
     */
    BILLBOARD_TYPE_DISABLED(0),
    /**
     * A standard billboarding algorithm is enabled.
     */
    BILLBOARD_TYPE_ENABLED(1),
    /**
     * A billboarding algorithm to rotate around Y-axis is enabled.
     */
    BILLBOARD_TYPE_FIXED_Y(2),
    /**
     * A billboarding algorithm designed to use on particles is enabled.
     */
    BILLBOARD_TYPE_PARTICLES(3),
    /**
     * Represents the size of the [enum BillboardType] enum.
     */
    BILLBOARD_TYPE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
