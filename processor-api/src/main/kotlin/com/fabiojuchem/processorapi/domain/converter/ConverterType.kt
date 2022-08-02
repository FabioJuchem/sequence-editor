package com.fabiojuchem.processorapi.domain.converter

import com.fabiojuchem.processorapi.domain.converter.converters.DnaToRnaConverter
import com.fabiojuchem.processorapi.domain.converter.converters.RnaToDnaConverter

enum class ConverterType(val converter: Converter) {
    DNA_TO_RNA(DnaToRnaConverter()),
    RNA_TO_DNA(RnaToDnaConverter())
}