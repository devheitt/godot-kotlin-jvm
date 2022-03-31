// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantArray
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for creating custom profilers.
 *
 * This class can be used to implement custom profilers that are able to interact with the engine and editor debugger.
 *
 * See [godot.EngineDebugger] and [godot.EditorDebuggerPlugin] for more information.
 */
@GodotBaseType
public open class EngineProfiler : RefCounted() {
  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_ENGINEPROFILER)
  }

  /**
   * Called when the profiler is enabled/disabled, along with a set of `options`.
   */
  public open fun _toggle(enable: Boolean, options: VariantArray<Any?>): Unit {
  }

  /**
   * Called when data is added to profiler using [godot.EngineDebugger.profilerAddFrameData].
   */
  public open fun _addFrame(`data`: VariantArray<Any?>): Unit {
  }

  /**
   * Called once every engine iteration when the profiler is active with information about the current frame.
   */
  public open fun _tick(
    frameTime: Double,
    idleTime: Double,
    physicsTime: Double,
    physicsFrameTime: Double
  ): Unit {
  }

  public companion object
}
