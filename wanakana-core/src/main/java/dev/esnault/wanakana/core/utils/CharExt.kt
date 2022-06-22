package dev.esnault.wanakana.core.utils


/**
 * Returns `true` if this is '・'.
 */
internal fun Char.isSlashDot(): Boolean = this.code == Constants.KANA_SLASH_DOT

/**
 * Returns `true` if this is 'ー'.
 */
internal fun Char.isLongDash(): Boolean = this.code == Constants.PROLONGED_SOUND_MARK


/**
 * Returns `true` is this is an English uppercase letter.
 */
internal fun Char.isEnglishUpperCase(): Boolean = this.code in Constants.LATIN_UPPERCASE_RANGE

/**
 * Returns `true` if this is considered English punctuation.
 */
internal fun Char.isEnglishPunctuation(): Boolean = this.code.let { charCode ->
    Constants.EN_PUNCTUATION_RANGES.any { range -> charCode in range }
}

/**
 * Returns `true` if this is considered Japanese punctuation.
 */
internal fun Char.isJapanesePunctuation(): Boolean = this.code.let { charCode ->
    Constants.JA_PUNCTUATION_RANGES.any { range -> charCode in range }
}
