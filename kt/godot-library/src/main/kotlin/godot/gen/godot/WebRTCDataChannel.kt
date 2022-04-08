// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.WebRTCDataChannel
import godot.`annotation`.GodotBaseType
import godot.core.GodotError
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

@GodotBaseType
public open class WebRTCDataChannel internal constructor() : PacketPeer() {
  public var writeMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_WRITE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_SET_WRITE_MODE,
          NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_WEBRTCDATACHANNEL)
  }

  public fun poll(): GodotError {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_POLL, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun close(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_CLOSE, NIL)
  }

  public fun wasStringPacket(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_WAS_STRING_PACKET,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getReadyState(): WebRTCDataChannel.ChannelState {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_READY_STATE,
        LONG)
    return WebRTCDataChannel.ChannelState.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  public fun getLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_LABEL, STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun isOrdered(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_IS_ORDERED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_ID, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getMaxPacketLifeTime(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_MAX_PACKET_LIFE_TIME, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getMaxRetransmits(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_MAX_RETRANSMITS, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public fun getProtocol(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_PROTOCOL,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  public fun isNegotiated(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_IS_NEGOTIATED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  public fun getBufferedAmount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_WEBRTCDATACHANNEL_GET_BUFFERED_AMOUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class WriteMode(
    id: Long
  ) {
    WRITE_MODE_TEXT(0),
    WRITE_MODE_BINARY(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class ChannelState(
    id: Long
  ) {
    STATE_CONNECTING(0),
    STATE_OPEN(1),
    STATE_CLOSING(2),
    STATE_CLOSED(3),
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
