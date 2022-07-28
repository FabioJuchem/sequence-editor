package com.fabiojuchem.processorapi.domain.converter.service

import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.Output
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class ConverterService {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun convert(input: Input, type: ConverterType): Mono<Output> {
        return type.converter.convert(input)
                .map { it }
                .doOnSuccess { logger.info("m=convert, message=Convert with Success, convertType=$type") }
                .doOnError { logger.error("m=convert, error=${it.localizedMessage}, message=Fail to convert") }
    }
}