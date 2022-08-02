package com.fabiojuchem.processorapi.domain.converter.converters

import java.text.Normalizer


private val REGEX_UNACCENT = "\\p{InCombiningDiacriticalMarks}+".toRegex()

fun CharSequence.unaccent(): String {
    val temp = Normalizer.normalize(this, Normalizer.Form.NFD)
    return REGEX_UNACCENT.replace(temp, "")
}

fun String.cleanString(): String {
    return this.trim().unaccent()
}