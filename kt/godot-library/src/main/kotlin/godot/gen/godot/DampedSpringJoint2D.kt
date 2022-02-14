// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Damped spring constraint for 2D physics.
 *
 * Damped spring constraint for 2D physics. This resembles a spring joint that always wants to go back to a given length.
 */
@GodotBaseType
public open class DampedSpringJoint2D : Joint2D() {
  /**
   * The spring joint's maximum length. The two attached bodies cannot stretch it past this value.
   */
  public open var length: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_GET_LENGTH,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_SET_LENGTH,
          NIL)
    }

  /**
   * When the bodies attached to the spring joint move they stretch or squash it. The joint always tries to resize towards this length.
   */
  public open var restLength: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_GET_REST_LENGTH, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_SET_REST_LENGTH, NIL)
    }

  /**
   * The higher the value, the less the bodies attached to the joint will deform it. The joint applies an opposing force to the bodies, the product of the stiffness multiplied by the size difference from its resting length.
   */
  public open var stiffness: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_GET_STIFFNESS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_SET_STIFFNESS,
          NIL)
    }

  /**
   * The spring joint's damping ratio. A value between `0` and `1`. When the two bodies move into different directions the system tries to align them to the spring axis again. A high `damping` value forces the attached bodies to align faster.
   */
  public open var damping: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_GET_DAMPING,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_DAMPEDSPRINGJOINT2D_SET_DAMPING,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_DAMPEDSPRINGJOINT2D)
  }

  public companion object
}
