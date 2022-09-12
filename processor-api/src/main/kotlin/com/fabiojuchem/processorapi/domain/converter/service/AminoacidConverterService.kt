package com.fabiojuchem.processorapi.domain.converter.service

import com.fabiojuchem.processorapi.domain.aminoacid.FetchType
import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.Output
import com.fabiojuchem.processorapi.domain.converter.converters.AminoacidConverter
import com.fabiojuchem.processorapi.domain.converter.decorators.ConverterDecorator
import com.fabiojuchem.processorapi.domain.converter.decorators.DecoratorType
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class AminoacidConverterService(
   private val aminoacidConverter: AminoacidConverter
) {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun convertAminoacid(input: Input, direction: Boolean, options: FetchType): Mono<Triple<String, String, String>> {
       return aminoacidConverter.convert(input, direction, options)
    }

}