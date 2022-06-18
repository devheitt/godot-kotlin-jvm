// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.GodotError
import godot.core.PackedByteArray
import godot.core.PackedInt32Array
import godot.core.PackedStringArray
import godot.core.RID
import godot.core.Rect2
import godot.core.TransferContext
import godot.core.Transform2D
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DICTIONARY
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_BYTE_ARRAY
import godot.core.VariantType.PACKED_INT_32_ARRAY
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.RECT2
import godot.core.VariantType.STRING
import godot.core.VariantType.TRANSFORM2D
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR2I
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.Vector2i
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Font source data and prerendered glyph cache, imported from dynamic or bitmap font.
 *
 * Supported font formats:
 *
 * - Dynamic font importer: TrueType (.ttf), TrueType collection (.ttc), OpenType (.otf), OpenType collection (.otc), WOFF (.woff), WOFF2 (.woff2), Type 1 (.pfb, .pfm).
 *
 * - Bitmap font importer: AngelCode BMFont (.fnt, .font), text and binary (version 3) format variants.
 *
 * - Monospace image font importer: All supported image formats.
 */
@GodotBaseType
public open class FontData : Resource() {
  /**
   * Contents of the dynamic font source file.
   */
  public var `data`: PackedByteArray
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_DATA,
          PACKED_BYTE_ARRAY)
      return TransferContext.readReturnValue(PACKED_BYTE_ARRAY, false) as PackedByteArray
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_BYTE_ARRAY to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_DATA, NIL)
    }

  /**
   * If set to `true`, font 8-bit anitialiased glyph rendering is supported and enabled.
   */
  public var antialiased: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_IS_ANTIALIASED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_ANTIALIASED, NIL)
    }

  /**
   * Font family name.
   */
  public var fontName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_FONT_NAME, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_FONT_NAME, NIL)
    }

  /**
   * Font style name.
   */
  public var styleName: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_FONT_STYLE_NAME,
          STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_FONT_STYLE_NAME, NIL)
    }

  /**
   * Font style flags, see [enum TextServer.FontStyle].
   */
  public var fontStyle: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_FONT_STYLE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_FONT_STYLE, NIL)
    }

  /**
   * Font glyph sub-pixel positioning mode. Subpixel positioning provides shaper text and better kerning for smaller font sizes, at the cost of memory usage and font rasterization speed. Use [godot.TextServer.SUBPIXEL_POSITIONING_AUTO] to automatically enable it based on the font size.
   */
  public var subpixelPositioning: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SUBPIXEL_POSITIONING,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_SUBPIXEL_POSITIONING,
          NIL)
    }

  /**
   * If is not equal to zero, emboldens the font outlines. Negative values reduce the outline thickness.
   */
  public var embolden: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_EMBOLDEN, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_EMBOLDEN, NIL)
    }

  /**
   * 2D transform, applied to the font outlines, can be used for slanting, flipping and rotating glyphs.
   *
   * For example, to simulate italic typeface by slanting, apply the following transform `Transform2D(1.0, slant, 0.0, 1.0, 0.0, 0.0)`.
   */
  public var transform: Transform2D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_TRANSFORM,
          TRANSFORM2D)
      return TransferContext.readReturnValue(TRANSFORM2D, false) as Transform2D
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM2D to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_TRANSFORM, NIL)
    }

  /**
   * If set to `true`, glyphs of all sizes are rendered using single multichannel signed distance field generated from the dynamic font vector data.
   */
  public var multichannelSignedDistanceField: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTDATA_IS_MULTICHANNEL_SIGNED_DISTANCE_FIELD, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_MULTICHANNEL_SIGNED_DISTANCE_FIELD, NIL)
    }

  /**
   * The width of the range around the shape between the minimum and maximum representable signed distance.
   */
  public var msdfPixelRange: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_MSDF_PIXEL_RANGE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_MSDF_PIXEL_RANGE,
          NIL)
    }

  /**
   * Source font size used to generate MSDF textures.
   */
  public var msdfSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_MSDF_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_MSDF_SIZE, NIL)
    }

  /**
   * If set to `true`, auto-hinting is supported and preferred over font built-in hinting. Used by dynamic fonts only.
   */
  public var forceAutohinter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_IS_FORCE_AUTOHINTER,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_FORCE_AUTOHINTER,
          NIL)
    }

  /**
   * Font hinting mode. Used by dynamic fonts only.
   */
  public var hinting: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_HINTING, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_HINTING, NIL)
    }

  /**
   * Font oversampling factor, if set to `0.0` global oversampling factor is used instead. Used by dynamic fonts only.
   */
  public var oversampling: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_OVERSAMPLING, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_OVERSAMPLING, NIL)
    }

  /**
   * Font size, used only for the bitmap fonts.
   */
  public var fixedSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_FIXED_SIZE, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_FIXED_SIZE, NIL)
    }

  /**
   * Font OpenType feature set override.
   */
  public var opentypeFeatureOverrides: Dictionary<Any?, Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_OPENTYPE_FEATURE_OVERRIDES, DICTIONARY)
      return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
    }
    set(`value`) {
      TransferContext.writeArguments(DICTIONARY to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_OPENTYPE_FEATURE_OVERRIDES, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_FONTDATA)
  }

  /**
   * Loads an AngelCode BMFont (.fnt, .font) bitmap font from file `path`.
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public fun loadBitmapFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_LOAD_BITMAP_FONT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Loads a TrueType (.ttf), TrueType collection (.ttc), OpenType (.otf), OpenType collection (.otc), WOFF (.woff), WOFF2 (.woff2) or Type 1 (.pfb, .pfm) dynamic font from file `path`.
   *
   * **Note:** Use [faceIndex] to select specific face from the collection file.
   *
   * **Warning:** This method should only be used in the editor or in cases when you need to load external fonts at run-time, such as fonts located at the `user://` directory.
   */
  public fun loadDynamicFont(path: String): GodotError {
    TransferContext.writeArguments(STRING to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_LOAD_DYNAMIC_FONT, LONG)
    return GodotError.values()[TransferContext.readReturnValue(JVM_INT) as Int]
  }

  /**
   * Returns existing or creates a new font cache entry for the specified variation coordinates.
   */
  public fun findCache(variationCoordinates: Dictionary<Any?, Any?>): RID {
    TransferContext.writeArguments(DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_FIND_CACHE, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns number of the font cache entries.
   */
  public fun getCacheCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_CACHE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes all font cache entries.
   */
  public fun clearCache(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_CLEAR_CACHE, NIL)
  }

  /**
   * Removes specified font cache entry.
   */
  public fun removeCache(cacheIndex: Long): Unit {
    TransferContext.writeArguments(LONG to cacheIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_CACHE, NIL)
  }

  /**
   * Returns list of the font sizes in the cache. Each size is `Vector2i` with font size and outline size.
   */
  public fun getSizeCacheList(cacheIndex: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to cacheIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SIZE_CACHE_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes all font sizes from the cache entry
   */
  public fun clearSizeCache(cacheIndex: Long): Unit {
    TransferContext.writeArguments(LONG to cacheIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_CLEAR_SIZE_CACHE, NIL)
  }

  /**
   * Removes specified font size from the cache entry.
   */
  public fun removeSizeCache(cacheIndex: Long, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_SIZE_CACHE, NIL)
  }

  /**
   * Sets variation coordinates for the specified font cache entry. See [getSupportedVariationList] for more info.
   */
  public fun setVariationCoordinates(cacheIndex: Long,
      variationCoordinates: Dictionary<Any?, Any?>): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, DICTIONARY to variationCoordinates)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_VARIATION_COORDINATES,
        NIL)
  }

  /**
   * Returns variation coordinates for the specified font cache entry. See [getSupportedVariationList] for more info.
   */
  public fun getVariationCoordinates(cacheIndex: Long): Dictionary<Any?, Any?> {
    TransferContext.writeArguments(LONG to cacheIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_VARIATION_COORDINATES,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Sets the font ascent (number of pixels above the baseline).
   */
  public fun setAscent(
    cacheIndex: Long,
    size: Long,
    ascent: Double
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, DOUBLE to ascent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_ASCENT, NIL)
  }

  /**
   * Returns the font ascent (number of pixels above the baseline).
   */
  public fun getAscent(cacheIndex: Long, size: Long): Double {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_ASCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets the font descent (number of pixels below the baseline).
   */
  public fun setDescent(
    cacheIndex: Long,
    size: Long,
    descent: Double
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, DOUBLE to descent)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_DESCENT, NIL)
  }

  /**
   * Returns font descent (number of pixels below the baseline).
   */
  public fun getDescent(cacheIndex: Long, size: Long): Double {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_DESCENT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets pixel offset of the underline below the baseline.
   */
  public fun setUnderlinePosition(
    cacheIndex: Long,
    size: Long,
    underlinePosition: Double
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, DOUBLE to underlinePosition)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_UNDERLINE_POSITION,
        NIL)
  }

  /**
   * Returns pixel offset of the underline below the baseline.
   */
  public fun getUnderlinePosition(cacheIndex: Long, size: Long): Double {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_UNDERLINE_POSITION,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets thickness of the underline in pixels.
   */
  public fun setUnderlineThickness(
    cacheIndex: Long,
    size: Long,
    underlineThickness: Double
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, DOUBLE to underlineThickness)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_UNDERLINE_THICKNESS,
        NIL)
  }

  /**
   * Returns thickness of the underline in pixels.
   */
  public fun getUnderlineThickness(cacheIndex: Long, size: Long): Double {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_UNDERLINE_THICKNESS,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets scaling factor of the color bitmap font.
   */
  public fun setScale(
    cacheIndex: Long,
    size: Long,
    scale: Double
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, DOUBLE to scale)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_SCALE, NIL)
  }

  /**
   * Returns scaling factor of the color bitmap font.
   */
  public fun getScale(cacheIndex: Long, size: Long): Double {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SCALE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets extra spacing added between glyphs in pixels.
   */
  public fun setSpacing(
    cacheIndex: Long,
    size: Long,
    spacingType: TextServer.SpacingType,
    `value`: Long
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, LONG to spacingType.id, LONG to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_SPACING, NIL)
  }

  /**
   * Returns extra spacing added between glyphs in pixels.
   */
  public fun getSpacing(
    cacheIndex: Long,
    size: Long,
    spacingType: TextServer.SpacingType
  ): Long {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, LONG to spacingType.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SPACING, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns number of textures used by font cache entry.
   */
  public fun getTextureCount(cacheIndex: Long, size: Vector2i): Long {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_TEXTURE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes all textures from font cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture, use [removeGlyph] to remove them manually.
   */
  public fun clearTextures(cacheIndex: Long, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_CLEAR_TEXTURES, NIL)
  }

  /**
   * Removes specified texture from font cache entry.
   *
   * **Note:** This function will not remove glyphs associated with the texture, remove them manually, using [removeGlyph].
   */
  public fun removeTexture(
    cacheIndex: Long,
    size: Vector2i,
    textureIndex: Long
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_TEXTURE, NIL)
  }

  /**
   * Sets font cache texture image.
   */
  public fun setTextureImage(
    cacheIndex: Long,
    size: Vector2i,
    textureIndex: Long,
    image: Image
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to textureIndex, OBJECT to image)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_TEXTURE_IMAGE, NIL)
  }

  /**
   * Returns a copy of the font cache texture image.
   */
  public fun getTextureImage(
    cacheIndex: Long,
    size: Vector2i,
    textureIndex: Long
  ): Image? {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_TEXTURE_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  /**
   * Sets array containing the first free pixel in the each column of texture. Should be the same size as texture width or empty (for the fonts without dynamic glyph generation support).
   */
  public fun setTextureOffsets(
    cacheIndex: Long,
    size: Vector2i,
    textureIndex: Long,
    offset: PackedInt32Array
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to textureIndex, PACKED_INT_32_ARRAY to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_TEXTURE_OFFSETS, NIL)
  }

  /**
   * Returns a copy of the array containing the first free pixel in the each column of texture. Should be the same size as texture width or empty.
   */
  public fun getTextureOffsets(
    cacheIndex: Long,
    size: Vector2i,
    textureIndex: Long
  ): PackedInt32Array {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to textureIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_TEXTURE_OFFSETS,
        PACKED_INT_32_ARRAY)
    return TransferContext.readReturnValue(PACKED_INT_32_ARRAY, false) as PackedInt32Array
  }

  /**
   * Returns list of rendered glyphs in the cache entry.
   */
  public fun getGlyphList(cacheIndex: Long, size: Vector2i): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes all rendered glyphs information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [removeTexture] to remove them manually.
   */
  public fun clearGlyphs(cacheIndex: Long, size: Vector2i): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_CLEAR_GLYPHS, NIL)
  }

  /**
   * Removes specified rendered glyph information from the cache entry.
   *
   * **Note:** This function will not remove textures associated with the glyphs, use [removeTexture] to remove them manually.
   */
  public fun removeGlyph(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_GLYPH, NIL)
  }

  /**
   * Sets glyph advance (offset of the next glyph).
   *
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public fun setGlyphAdvance(
    cacheIndex: Long,
    size: Long,
    glyph: Long,
    advance: Vector2
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, LONG to glyph, VECTOR2 to advance)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_GLYPH_ADVANCE, NIL)
  }

  /**
   * Returns glyph advance (offset of the next glyph).
   *
   * **Note:** Advance for glyphs outlines is the same as the base glyph advance and is not saved.
   */
  public fun getGlyphAdvance(
    cacheIndex: Long,
    size: Long,
    glyph: Long
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_ADVANCE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets glyph offset from the baseline.
   */
  public fun setGlyphOffset(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long,
    offset: Vector2
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph, VECTOR2 to offset)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_GLYPH_OFFSET, NIL)
  }

  /**
   * Returns glyph offset from the baseline.
   */
  public fun getGlyphOffset(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_OFFSET, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets glyph size.
   */
  public fun setGlyphSize(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long,
    glSize: Vector2
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph, VECTOR2 to glSize)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_GLYPH_SIZE, NIL)
  }

  /**
   * Returns glyph size.
   */
  public fun getGlyphSize(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_SIZE, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Sets rectangle in the cache texture containing the glyph.
   */
  public fun setGlyphUvRect(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long,
    uvRect: Rect2
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph, RECT2 to uvRect)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_GLYPH_UV_RECT, NIL)
  }

  /**
   * Returns rectangle in the cache texture containing the glyph.
   */
  public fun getGlyphUvRect(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long
  ): Rect2 {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_UV_RECT, RECT2)
    return TransferContext.readReturnValue(RECT2, false) as Rect2
  }

  /**
   * Sets index of the cache texture containing the glyph.
   */
  public fun setGlyphTextureIdx(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long,
    textureIdx: Long
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph, LONG to textureIdx)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_GLYPH_TEXTURE_IDX, NIL)
  }

  /**
   * Returns index of the cache texture containing the glyph.
   */
  public fun getGlyphTextureIdx(
    cacheIndex: Long,
    size: Vector2i,
    glyph: Long
  ): Long {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to glyph)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_TEXTURE_IDX,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns list of the kerning overrides.
   */
  public fun getKerningList(cacheIndex: Long, size: Long): VariantArray<Any?> {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_KERNING_LIST, ARRAY)
    return TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>
  }

  /**
   * Removes all kerning overrides.
   */
  public fun clearKerningMap(cacheIndex: Long, size: Long): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_CLEAR_KERNING_MAP, NIL)
  }

  /**
   * Removes kerning override for the pair of glyphs.
   */
  public fun removeKerning(
    cacheIndex: Long,
    size: Long,
    glyphPair: Vector2i
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_KERNING, NIL)
  }

  /**
   * Sets kerning for the pair of glyphs.
   */
  public fun setKerning(
    cacheIndex: Long,
    size: Long,
    glyphPair: Vector2i,
    kerning: Vector2
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, VECTOR2I to glyphPair, VECTOR2 to kerning)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_KERNING, NIL)
  }

  /**
   * Returns kerning for the pair of glyphs.
   */
  public fun getKerning(
    cacheIndex: Long,
    size: Long,
    glyphPair: Vector2i
  ): Vector2 {
    TransferContext.writeArguments(LONG to cacheIndex, LONG to size, VECTOR2I to glyphPair)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_KERNING, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Renders the range of characters to the font cache texture.
   */
  public fun renderRange(
    cacheIndex: Long,
    size: Vector2i,
    start: Long,
    end: Long
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to start, LONG to end)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_RENDER_RANGE, NIL)
  }

  /**
   * Renders specified glyph the the font cache texture.
   */
  public fun renderGlyph(
    cacheIndex: Long,
    size: Vector2i,
    index: Long
  ): Unit {
    TransferContext.writeArguments(LONG to cacheIndex, VECTOR2I to size, LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_RENDER_GLYPH, NIL)
  }

  /**
   * Returns text server font cache entry resource id.
   */
  public fun getCacheRid(cacheIndex: Long): RID {
    TransferContext.writeArguments(LONG to cacheIndex)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_CACHE_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns `true`, if font supports given language ([godot.ISO 639](https://en.wikipedia.org/wiki/ISO_639-1) code).
   */
  public fun isLanguageSupported(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_IS_LANGUAGE_SUPPORTED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds override for [isLanguageSupported].
   */
  public fun setLanguageSupportOverride(language: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to language, BOOL to supported)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_LANGUAGE_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the `language`.
   */
  public fun getLanguageSupportOverride(language: String): Boolean {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_LANGUAGE_SUPPORT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Remove language support override.
   */
  public fun removeLanguageSupportOverride(language: String): Unit {
    TransferContext.writeArguments(STRING to language)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_LANGUAGE_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns list of language support overrides.
   */
  public fun getLanguageSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_LANGUAGE_SUPPORT_OVERRIDES, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns `true`, if font supports given script ([godot.ISO 15924](https://en.wikipedia.org/wiki/ISO_15924) code).
   */
  public fun isScriptSupported(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_IS_SCRIPT_SUPPORTED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Adds override for [isScriptSupported].
   */
  public fun setScriptSupportOverride(script: String, supported: Boolean): Unit {
    TransferContext.writeArguments(STRING to script, BOOL to supported)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_SET_SCRIPT_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns `true` if support override is enabled for the `script`.
   */
  public fun getScriptSupportOverride(script: String): Boolean {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SCRIPT_SUPPORT_OVERRIDE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes script support override.
   */
  public fun removeScriptSupportOverride(script: String): Unit {
    TransferContext.writeArguments(STRING to script)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_REMOVE_SCRIPT_SUPPORT_OVERRIDE, NIL)
  }

  /**
   * Returns list of script support overrides.
   */
  public fun getScriptSupportOverrides(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SCRIPT_SUPPORT_OVERRIDES, PACKED_STRING_ARRAY)
    return TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray
  }

  /**
   * Returns `true` if a Unicode `char` is available in the font.
   */
  public fun hasChar(char: Long): Boolean {
    TransferContext.writeArguments(LONG to char)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_HAS_CHAR, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns a string containing all the characters available in the font.
   */
  public fun getSupportedChars(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SUPPORTED_CHARS,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Returns the glyph index of a `char`, optionally modified by the `variation_selector`.
   */
  public fun getGlyphIndex(
    size: Long,
    char: Long,
    variationSelector: Long
  ): Long {
    TransferContext.writeArguments(LONG to size, LONG to char, LONG to variationSelector)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_GLYPH_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns list of OpenType features supported by font.
   */
  public fun getSupportedFeatureList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SUPPORTED_FEATURE_LIST,
        DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  /**
   * Returns list of supported [variation coordinates](https://docs.microsoft.com/en-us/typography/opentype/spec/dvaraxisreg), each coordinate is returned as `tag: Vector3i(min_value,max_value,default_value)`.
   *
   * Font variations allow for continuous change of glyph characteristics along some given design axis, such as weight, width or slant.
   */
  public fun getSupportedVariationList(): Dictionary<Any?, Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_FONTDATA_GET_SUPPORTED_VARIATION_LIST, DICTIONARY)
    return TransferContext.readReturnValue(DICTIONARY, false) as Dictionary<Any?, Any?>
  }

  public companion object
}
