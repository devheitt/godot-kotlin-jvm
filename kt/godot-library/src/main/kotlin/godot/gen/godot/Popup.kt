// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Suppress
import kotlin.Unit

/**
 * Popup is a base window container for popup-like subwindows.
 *
 * Popup is a base window container for popup-like subwindows. It's a modal by default (see [popupWindow]) and has helpers for custom popup behavior.
 */
@GodotBaseType
public open class Popup : Window() {
  /**
   * Emitted when the popup is hidden.
   */
  public val popupHide: Signal0 by signal()

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_POPUP)
  }

  public companion object
}
