package com.fabiojuchem.processorapi.domain.converter

import reactor.core.publisher.Mono

interface Converter {

    fun convert(input: Input): Mono<Output>
}