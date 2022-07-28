package com.fabiojuchem.processorapi.domain.converter.service

import com.fabiojuchem.common.infrastructure.extension.toJsonString
import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.Output
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@Service
class ConverterService {

    private val logger = LoggerFactory.getLogger(this::class.java)

    fun convert(input: Input, type: ConverterType): Mono<String> {
        return type.converter.convert(input)
                .map { it.toJsonString() }
                .doOnSuccess { logger.info("m=convert, message=Convert with Success") }
                .doOnError { logger.error("m=convert, error=${it.localizedMessage}, message=Fail to convert") }
    }
}