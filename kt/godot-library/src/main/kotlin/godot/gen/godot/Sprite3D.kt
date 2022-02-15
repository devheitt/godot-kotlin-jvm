// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.RECT2
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 2D sprite node in a 3D world.
 *
 * A node that displays a 2D texture in a 3D environment. The texture displayed can be a region from a larger atlas texture, or a frame from a sprite sheet animation. See also [godot.SpriteBase3D] where properties such as the billboard mode are defined.
 */
@GodotBaseType
public open class Sprite3D : SpriteBase3D() {
  /**
   * Emitted when the [frame] changes.
   */
  public val frameChanged: Signal0 by signal()

  /**
   * Emitted when the [texture] changes.
   */
  public val textureChanged: Signal0 by signal()

  /**
   * [godot.Texture2D] object to draw.
   */
  public open var texture: Texture?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_TEXTURE, OBJECT)
      return TransferContext.readReturnValue(OBJECT, true) as Texture?
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_TEXTURE, NIL)
    }

  /**
   * The number of columns in the sprite sheet.
   */
  public open var hframes: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_HFRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_HFRAMES, NIL)
    }

  /**
   * The number of rows in the sprite sheet.
   */
  public open var vframes: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_VFRAMES, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_VFRAMES, NIL)
    }

  /**
   * Current frame to display from sprite sheet. [hframes] or [vframes] must be greater than 1.
   */
  public open var frame: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_FRAME, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_FRAME, NIL)
    }

  /**
   * Coordinates of the frame to display from sprite sheet. This is as an alias for the [frame] property. [hframes] or [vframes] must be greater than 1.
   */
  public open var frameCoords: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_FRAME_COORDS,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_FRAME_COORDS, NIL)
    }

  /**
   *
   */
  public open var regionEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_REGION_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_REGION_ENABLED, NIL)
    }

  /**
   * The region of the atlas texture to display. [regionEnabled] must be `true`.
   */
  public open var regionRect: Rect2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_GET_REGION_RECT, RECT2)
      return TransferContext.readReturnValue(RECT2, false) as Rect2
    }
    set(`value`) {
      TransferContext.writeArguments(RECT2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_SPRITE3D_SET_REGION_RECT, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_SPRITE3D)
  }

  public companion object
}
