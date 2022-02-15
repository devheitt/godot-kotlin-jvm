// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedByteArray
import godot.core.TransferContext
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Data buffer stream peer.
 *
 * Data buffer stream peer that uses a byte array as the stream. This object can be used to handle binary data from network sessions. To handle binary data stored in files, [godot.File] can be used directly.
 *
 * A [godot.StreamPeerBuffer] object keeps an internal cursor which is the offset in bytes to the start of the buffer. Get and put operations are performed at the cursor position and will move the cursor accordingly.
 */
@GodotBaseType
public open class StreamPeerBuffer : StreamPeer() {
  /**
   * The underlying data buffer. Setting this value resets the cursor.
   */
  public open var dataArray: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_GET_DATA_ARRAY,
          PACKED_BYTE_ARRAY)
      return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_SET_DATA_ARRAY,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_STREAMPEERBUFFER)
  }

  /**
   * Moves the cursor to the specified position. `position` must be a valid index of [dataArray].
   */
  public open fun seek(position: Long): Unit {
    TransferContext.writeArguments(LONG to position)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_SEEK, NIL)
  }

  /**
   * Returns the size of [dataArray].
   */
  public open fun getSize(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_GET_SIZE, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the current cursor position.
   */
  public open fun getPosition(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_GET_POSITION, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Resizes the [dataArray]. This *doesn't* update the cursor.
   */
  public open fun resize(size: Long): Unit {
    TransferContext.writeArguments(LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_RESIZE, NIL)
  }

  /**
   * Clears the [dataArray] and resets the cursor.
   */
  public open fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_CLEAR, NIL)
  }

  /**
   * Returns a new [godot.StreamPeerBuffer] with the same [dataArray] content.
   */
  public open fun duplicate(): StreamPeerBuffer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STREAMPEERBUFFER_DUPLICATE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as StreamPeerBuffer?
  }

  public companion object
}
