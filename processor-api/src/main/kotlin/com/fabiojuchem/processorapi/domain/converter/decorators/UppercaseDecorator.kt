package com.fabiojuchem.processorapi.domain.converter.decorators

import com.fabiojuchem.processorapi.domain.converter.Output
import org.springframework.stereotype.Component

@Component
class UppercaseDecorator : ConverterDecorator {

    override val type: DecoratorType
        get() = DecoratorType.UPPERCASE

    override fun apply(output: Output): Output {
        output.value = output.value.toUpperCase()
        return output
    }

}