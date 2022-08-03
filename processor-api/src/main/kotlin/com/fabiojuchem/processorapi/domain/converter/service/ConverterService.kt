package com.fabiojuchem.processorapi.domain.converter.service

import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.Output
import com.fabiojuchem.processorapi.domain.converter.decorators.ConverterDecorator
import com.fabiojuchem.processorapi.domain.converter.decorators.DecoratorType
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ConverterService(
        val decorators: List<ConverterDecorator>
) {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun convert(input: Input, type: ConverterType, options: List<DecoratorType>): Mono<Output> {
        return type.converter.convert(input)
                .map { applyDecorators(it, options) }
                .doOnSuccess { logger.info("m=convert, message=Convert with Success, convertType=$type") }
                .doOnError { logger.error("m=convert, error=${it.localizedMessage}, message=Fail to convert") }
    }

    private fun applyDecorators(it: Output, options: List<DecoratorType>): Output {
        val decorators = options.map { getDecoratorByType(it) }
        decorators.forEach { dec -> dec.apply(it) }
        return it
    }

    fun getDecoratorByType(type: DecoratorType) = decorators.filter { it.type == type }.first()

}