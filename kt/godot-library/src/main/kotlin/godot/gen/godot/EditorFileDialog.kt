// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedStringArray
import godot.core.TransferContext
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Boolean
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A modified version of [godot.FileDialog] used by the editor.
 */
@GodotBaseType
public open abstract class EditorFileDialog : ConfirmationDialog() {
  /**
   * Emitted when multiple files are selected.
   */
  public val filesSelected: Signal1<PackedStringArray> by signal("paths")

  /**
   * Emitted when a directory is selected.
   */
  public val dirSelected: Signal1<String> by signal("dir")

  /**
   * Emitted when a file is selected.
   */
  public val fileSelected: Signal1<String> by signal("path")

  /**
   * The location from which the user may select a file, including `res://`, `user://`, and the local file system.
   */
  public open var access: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_ACCESS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_ACCESS, NIL)
    }

  /**
   * The view format in which the [godot.EditorFileDialog] displays resources to the user.
   */
  public open var displayMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_DISPLAY_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_DISPLAY_MODE,
          NIL)
    }

  /**
   * The dialog's open or save mode, which affects the selection behavior. See [enum FileMode]
   */
  public open var fileMode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_FILE_MODE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_FILE_MODE,
          NIL)
    }

  /**
   * The currently occupied directory.
   */
  public open var currentDir: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_CURRENT_DIR,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_CURRENT_DIR,
          NIL)
    }

  /**
   * The currently selected file.
   */
  public open var currentFile: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_CURRENT_FILE,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_CURRENT_FILE,
          NIL)
    }

  /**
   * The file system path in the address bar.
   */
  public open var currentPath: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_CURRENT_PATH,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_CURRENT_PATH,
          NIL)
    }

  /**
   * If `true`, hidden files and directories will be visible in the [godot.EditorFileDialog].
   */
  public open var showHiddenFiles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_IS_SHOWING_HIDDEN_FILES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_SHOW_HIDDEN_FILES, NIL)
    }

  /**
   * If `true`, the [godot.EditorFileDialog] will not warn the user before overwriting files.
   */
  public open var disableOverwriteWarning: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_IS_OVERWRITE_WARNING_DISABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_SET_DISABLE_OVERWRITE_WARNING, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_EDITORFILEDIALOG)
  }

  /**
   * Removes all filters except for "All Files (*)".
   */
  public open fun clearFilters(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_CLEAR_FILTERS, NIL)
  }

  /**
   * Adds a comma-delimited file extension filter option to the [godot.EditorFileDialog] with an optional semi-colon-delimited label.
   *
   * For example, `"*.tscn, *.scn; Scenes"` results in filter text "Scenes (*.tscn, *.scn)".
   */
  public open fun addFilter(filter: String): Unit {
    TransferContext.writeArguments(STRING to filter)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_ADD_FILTER, NIL)
  }

  /**
   * Returns the `VBoxContainer` used to display the file system.
   *
   * **Warning:** This is a required internal node, removing and freeing it may cause a crash. If you wish to hide it or any of its children, use their [godot.CanvasItem.visible] property.
   */
  public open fun getVbox(): VBoxContainer? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_GET_VBOX, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as VBoxContainer?
  }

  /**
   * Notify the [godot.EditorFileDialog] that its view of the data is no longer accurate. Updates the view contents on next view update.
   */
  public open fun invalidate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_EDITORFILEDIALOG_INVALIDATE, NIL)
  }

  public enum class DisplayMode(
    id: Long
  ) {
    /**
     * The [godot.EditorFileDialog] displays resources as thumbnails.
     */
    DISPLAY_THUMBNAILS(0),
    /**
     * The [godot.EditorFileDialog] displays resources as a list of filenames.
     */
    DISPLAY_LIST(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class FileMode(
    id: Long
  ) {
    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will open the file.
     */
    FILE_MODE_OPEN_FILE(0),
    /**
     * The [godot.EditorFileDialog] can select multiple files. Accepting the window will open all files.
     */
    FILE_MODE_OPEN_FILES(1),
    /**
     * The [godot.EditorFileDialog] can select only one directory. Accepting the window will open the directory.
     */
    FILE_MODE_OPEN_DIR(2),
    /**
     * The [godot.EditorFileDialog] can select a file or directory. Accepting the window will open it.
     */
    FILE_MODE_OPEN_ANY(3),
    /**
     * The [godot.EditorFileDialog] can select only one file. Accepting the window will save the file.
     */
    FILE_MODE_SAVE_FILE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Access(
    id: Long
  ) {
    /**
     * The [godot.EditorFileDialog] can only view `res://` directory contents.
     */
    ACCESS_RESOURCES(0),
    /**
     * The [godot.EditorFileDialog] can only view `user://` directory contents.
     */
    ACCESS_USERDATA(1),
    /**
     * The [godot.EditorFileDialog] can view the entire local file system.
     */
    ACCESS_FILESYSTEM(2),
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
