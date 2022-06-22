package dev.esnault.wanakana.core.utils

import java.util.*

/**
 * Returns this string in English uppercase.
 * Without using the English locale, `toUpperCase` can have surprising results, even for English
 * text depending on the user locale. For example the Turkish locale will transform 'i' to 'İ'.
 */
internal fun String.safeUpperCase(): String = this.uppercase(Locale.ENGLISH)

/**
 * Returns this string in English lowercase.
 * Without using the English locale, `toUpperCase` can have surprising results, even for English
 * text depending on the user locale. For example the Turkish locale will transform 'I' to 'ı'.
 */
internal fun String.safeLowerCase(): String = this.lowercase(Locale.ENGLISH)

/**
 * Returns `true` if this string only contains english punctation.
 */
internal fun String.isEnglishPunctuation(): Boolean = this.all(Char::isEnglishPunctuation)
