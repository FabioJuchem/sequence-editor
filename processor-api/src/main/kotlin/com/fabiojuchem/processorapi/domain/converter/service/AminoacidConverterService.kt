package com.fabiojuchem.processorapi.domain.converter.service

import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.Output
import com.fabiojuchem.processorapi.domain.converter.decorators.ConverterDecorator
import com.fabiojuchem.processorapi.domain.converter.decorators.DecoratorType
import org.slf4j.LoggerFactory
import reactor.core.publisher.Mono

class AminoacidConverterService(
    val decorators: List<ConverterDecorator>
) {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun convertAminoacid(input: Input, options: List<DecoratorType>): Mono<Output> {

    }

}