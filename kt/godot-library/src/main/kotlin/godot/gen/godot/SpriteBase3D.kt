// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Double
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in 3D environment.
 *
 * A node that displays 2D texture information in a 3D environment. See also [godot.Sprite3D] where many other properties are defined.
 */
@GodotBaseType
public open abstract class SpriteBase3D : GeometryInstance3D() {
  /**
   * If `true`, texture will be centered.
   */
  public open var centered: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_CENTERED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_CENTERED, NIL)
    }

  /**
   * The texture's drawing offset.
   */
  public open var offset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_OFFSET, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_OFFSET, NIL)
    }

  /**
   * If `true`, texture is flipped horizontally.
   */
  public open var flipH: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FLIP_H, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FLIP_H, NIL)
    }

  /**
   * If `true`, texture is flipped vertically.
   */
  public open var flipV: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_FLIP_V, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_FLIP_V, NIL)
    }

  /**
   * A color value used to *multiply* the texture's colors. Can be used for mood-coloring or to simulate the color of light.
   *
   * **Note:** If a [godot.GeometryInstance3D.materialOverride] is defined on the [godot.SpriteBase3D], the material override must be configured to take vertex colors into account for albedo. Otherwise, the color defined in [modulate] will be ignored. For a [godot.BaseMaterial3D], [godot.BaseMaterial3D.vertexColorUseAsAlbedo] must be `true`. For a [godot.ShaderMaterial], `ALBEDO *= COLOR.rgb;[/color] must be inserted in the shader's `fragment()` function.
   */
  public open var modulate: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_MODULATE, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_MODULATE, NIL)
    }

  /**
   * The size of one pixel's width on the sprite to scale it in 3D.
   */
  public open var pixelSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_PIXEL_SIZE,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_PIXEL_SIZE, NIL)
    }

  /**
   * The direction in which the front of the texture faces.
   */
  public open var axis: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_AXIS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_AXIS, NIL)
    }

  /**
   * The billboard mode to use for the sprite. See [enum BaseMaterial3D.BillboardMode] for possible values.
   */
  public open var billboard: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_BILLBOARD, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_BILLBOARD, NIL)
    }

  /**
   * The alpha cutting mode to use for the sprite. See [enum AlphaCutMode] for possible values.
   */
  public open var alphaCut: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_ALPHA_CUT, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_ALPHA_CUT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPRITEBASE3D)
  }

  /**
   * If `true`, the specified flag will be enabled. See [enum SpriteBase3D.DrawFlags] for a list of flags.
   */
  public open fun setDrawFlag(flag: SpriteBase3D.DrawFlags, enabled: Boolean): Unit {
    TransferContext.writeArguments(LONG to flag.id, BOOL to enabled)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_SET_DRAW_FLAG, NIL)
  }

  /**
   * Returns the value of the specified flag.
   */
  public open fun getDrawFlag(flag: SpriteBase3D.DrawFlags): Boolean {
    TransferContext.writeArguments(LONG to flag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_DRAW_FLAG, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the rectangle representing this sprite.
   */
  public open fun getItemRect(): Rect2 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GET_ITEM_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Returns a [godot.TriangleMesh] with the sprite's vertices following its current configuration (such as its [axis] and [pixelSize]).
   */
  public open fun generateTriangleMesh(): TriangleMesh? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITEBASE3D_GENERATE_TRIANGLE_MESH,
        OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as TriangleMesh?
  }

  public enum class DrawFlags(
    id: Long
  ) {
    /**
     * If set, the texture's transparency and the opacity are used to make those parts of the sprite invisible.
     */
    FLAG_TRANSPARENT(0),
    /**
     * If set, lights in the environment affect the sprite.
     */
    FLAG_SHADED(1),
    /**
     * If set, texture can be seen from the back as well. If not, the texture is invisible when looking at it from behind.
     */
    FLAG_DOUBLE_SIDED(2),
    /**
     * Represents the size of the [enum DrawFlags] enum.
     */
    FLAG_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class AlphaCutMode(
    id: Long
  ) {
    /**
     * This mode performs standard alpha blending. It can display translucent areas, but transparency sorting issues may be visible when multiple transparent materials are overlapping.
     */
    ALPHA_CUT_DISABLED(0),
    /**
     * This mode only allows fully transparent or fully opaque pixels. Harsh edges will be visible unless some form of screen-space antialiasing is enabled (see [godot.ProjectSettings.rendering/antiAliasing/quality/screenSpaceAa]). On the bright side, this mode doesn't suffer from transparency sorting issues when multiple transparent materials are overlapping. This mode is also known as *alpha testing* or *1-bit transparency*.
     */
    ALPHA_CUT_DISCARD(1),
    /**
     * This mode draws fully opaque pixels in the depth prepass. This is slower than [ALPHA_CUT_DISABLED] or [ALPHA_CUT_DISCARD], but it allows displaying translucent areas and smooth edges while using proper sorting.
     */
    ALPHA_CUT_OPAQUE_PREPASS(2),
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
