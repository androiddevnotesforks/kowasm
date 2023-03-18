// This file was generated using the `kotlin-html-generator` module. Instead of modifying it, modify the
// `html-builder-generator` and run it again.
@file:Suppress("unused")

package dev.scottpierce.html.writer.style

import dev.scottpierce.html.writer.BaseStyleContext
import dev.scottpierce.html.writer.InlineStyleContext
import dev.scottpierce.html.writer.StyleContext
import kotlin.Boolean
import kotlin.Suppress

fun BaseStyleContext.borderRightWidth(value: Dimension, important: Boolean = false) {
    writeStyleProperty("border-right-width", value, important)
}

fun BaseStyleContext.borderRightWidth(value: BorderStyle, important: Boolean = false) {
    writeStyleProperty("border-right-width", value, important)
}

fun StyleContext.borderRightWidth(value: Dimension, important: Boolean = false) {
    writeStyleProperty("border-right-width", value, important)
}

fun StyleContext.borderRightWidth(value: BorderStyle, important: Boolean = false) {
    writeStyleProperty("border-right-width", value, important)
}

fun InlineStyleContext.borderRightWidth(value: Dimension, important: Boolean = false) {
    writeStyleProperty("border-right-width", value, important)
}

fun InlineStyleContext.borderRightWidth(value: BorderStyle, important: Boolean = false) {
    writeStyleProperty("border-right-width", value, important)
}
