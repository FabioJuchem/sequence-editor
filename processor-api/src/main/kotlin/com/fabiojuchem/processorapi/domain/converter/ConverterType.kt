package com.fabiojuchem.processorapi.domain.converter

import com.fabiojuchem.processorapi.domain.converter.converters.DnaToRnaConverter

enum class ConverterType(val converter: Converter) {
    DNA_TO_RNA(DnaToRnaConverter())
}