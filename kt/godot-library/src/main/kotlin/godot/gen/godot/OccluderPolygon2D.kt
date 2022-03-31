// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Defines a 2D polygon for LightOccluder2D.
 *
 * Editor facility that helps you draw a 2D polygon used as resource for [godot.LightOccluder2D].
 */
@GodotBaseType
public open class OccluderPolygon2D : Resource() {
  /**
   * If `true`, closes the polygon. A closed OccluderPolygon2D occludes the light coming from any direction. An opened OccluderPolygon2D occludes the light only at its outline's direction.
   */
  public open var closed: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_IS_CLOSED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_SET_CLOSED, NIL)
    }

  /**
   * The culling mode to use.
   */
  public open var cullMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_GET_CULL_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_SET_CULL_MODE,
          NIL)
    }

  /**
   * A [godot.core.Vector2] array with the index for polygon's vertices positions.
   *
   * **Note:** The returned value is a copy of the underlying array, rather than a reference.
   */
  public open var polygon: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_GET_POLYGON,
          PACKED_VECTOR2_ARRAY)
      return TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_OCCLUDERPOLYGON2D_SET_POLYGON,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_OCCLUDERPOLYGON2D)
  }

  public enum class CullMode(
    id: Long
  ) {
    /**
     * Culling is disabled. See [cullMode].
     */
    CULL_DISABLED(0),
    /**
     * Culling is performed in the clockwise direction. See [cullMode].
     */
    CULL_CLOCKWISE(1),
    /**
     * Culling is performed in the counterclockwise direction. See [cullMode].
     */
    CULL_COUNTER_CLOCKWISE(2),
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
