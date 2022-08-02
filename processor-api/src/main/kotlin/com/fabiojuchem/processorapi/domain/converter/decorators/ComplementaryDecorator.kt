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
                'a' -> 't'
                't' -> 'a'
                'c' -> 'g'
                'g' -> 'c'
                else -> ' '
            }
        }.joinToString().replace(" ", "")
        return output
    }

}