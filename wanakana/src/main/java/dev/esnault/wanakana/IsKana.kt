package dev.esnault.wanakana

import dev.esnault.wanakana.utils.isKana


/**
 * Returns `true` if [input] is [Kana](https://en.wikipedia.org/wiki/Kana).
 * 
 * For example
 * - `isKana("あ")` => `true`
 * - `isKana("ア")` => `true`
 * - `isKana("あーア")` => `true`
 * - `isKana("A")` => `false`
 * - `isKana("あAア")` => `false`
 */
fun isKana(input: String): Boolean = input.all(Char::isKana)
