package com.fabiojuchem.processorapi.domain.converter.decorators

import com.fabiojuchem.processorapi.domain.converter.Output
import org.springframework.stereotype.Component

@Component
class ComplementaryDecorator : ConverterDecorator {

    override val type: DecoratorType
        get() = DecoratorType.COMPLEMENTARY

    override fun apply(output: Output): Output {
        val value = output.value
        output.value = value.toCharArray().map {
            when(it) {
                'A' -> 'T'
                'T' -> 'A'
                'C' -> 'G'
                'G' -> 'C'
                else -> ' '
            }
        }.joinToString("").replace(" ", "")
        return output
    }

}