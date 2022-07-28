package com.fabiojuchem.processorapi.domain.converter.converters

import com.fabiojuchem.processorapi.domain.converter.Converter
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.Output
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

class DnaToRnaConverter : Converter{

    override fun convert(input: Input): Mono<Output> {
        return input.toMono()
            .map { input.value.cleanString() }
            .map { it.replace("U", "T") }
            .map { Output(it) }
    }


}