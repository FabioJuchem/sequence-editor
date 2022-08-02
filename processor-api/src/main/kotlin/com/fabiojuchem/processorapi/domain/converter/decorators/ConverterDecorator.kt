package com.fabiojuchem.processorapi.domain.converter.decorators

import com.fabiojuchem.processorapi.domain.converter.Output

interface ConverterDecorator {

    val type: DecoratorType

    fun apply(output: Output): Output
}