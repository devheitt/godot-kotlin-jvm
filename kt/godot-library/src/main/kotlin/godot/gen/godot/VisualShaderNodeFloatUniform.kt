// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A scalar float uniform to be used within the visual shader graph.
 *
 * Translated to `uniform float` in the shader language.
 */
@GodotBaseType
public open class VisualShaderNodeFloatUniform : VisualShaderNodeUniform() {
  /**
   * A hint applied to the uniform, which controls the values it can take when set through the inspector.
   */
  public open var hint: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_GET_HINT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_SET_HINT, NIL)
    }

  /**
   * Maximum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public open var min: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_GET_MIN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_SET_MIN, NIL)
    }

  /**
   * Minimum value for range hints. Used if [hint] is set to [HINT_RANGE] or [HINT_RANGE_STEP].
   */
  public open var max: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_GET_MAX, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_SET_MAX, NIL)
    }

  /**
   * Step (increment) value for the range hint with step. Used if [hint] is set to [HINT_RANGE_STEP].
   */
  public open var step: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_GET_STEP, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_SET_STEP, NIL)
    }

  /**
   * Enables usage of the [defaultValue].
   */
  public open var defaultValueEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_GET_DEFAULT_VALUE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_SET_DEFAULT_VALUE_ENABLED, NIL)
    }

  /**
   * A default value to be assigned within the shader.
   */
  public open var defaultValue: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_GET_DEFAULT_VALUE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM_SET_DEFAULT_VALUE, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODEFLOATUNIFORM)
  }

  public enum class Hint(
    id: Long
  ) {
    /**
     * No hint used.
     */
    HINT_NONE(0),
    /**
     * A range hint for scalar value, which limits possible input values between [min] and [max]. Translated to `hint_range(min, max)` in shader code.
     */
    HINT_RANGE(1),
    /**
     * A range hint for scalar value with step, which limits possible input values between [min] and [max], with a step (increment) of [step]). Translated to `hint_range(min, max, step)` in shader code.
     */
    HINT_RANGE_STEP(2),
    /**
     * Represents the size of the [enum Hint] enum.
     */
    HINT_MAX(3),
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
