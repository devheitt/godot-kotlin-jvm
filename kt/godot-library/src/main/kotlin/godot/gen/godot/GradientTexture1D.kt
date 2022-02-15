// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Gradient-filled texture.
 *
 * GradientTexture1D uses a [godot.Gradient] to fill the texture data. The gradient will be filled from left to right using colors obtained from the gradient. This means the texture does not necessarily represent an exact copy of the gradient, but instead an interpolation of samples obtained from the gradient at fixed steps (see [width]).
 */
@GodotBaseType
public open class GradientTexture1D : Texture2D() {
  /**
   * The [godot.Gradient] that will be used to fill the texture.
   */
  public open var gradient: Gradient?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE1D_GET_GRADIENT,
          OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Gradient?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE1D_SET_GRADIENT,
          NIL)
    }

  /**
   * The number of color samples that will be obtained from the [godot.Gradient].
   */
  public open var width: Long
    @JvmName("getWidth_prop")
    @Suppress("INAPPLICABLE_JVM_NAME")
    get() = super.getWidth()
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE1D_SET_WIDTH, NIL)
    }

  /**
   * If `true`, the generated texture will support high dynamic range ([godot.Image.FORMAT_RGBAF] format). This allows for glow effects to work if [godot.Environment.glowEnabled] is `true`. If `false`, the generated texture will use low dynamic range; overbright colors will be clamped ([godot.Image.FORMAT_RGBA8] format).
   */
  public open var useHdr: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE1D_GET_USE_HDR,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_GRADIENTTEXTURE1D_SET_USE_HDR,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_GRADIENTTEXTURE1D)
  }

  public companion object
}
