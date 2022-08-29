package com.fabiojuchem.processorapi.domain.converter.converters

import com.fabiojuchem.processorapi.domain.aminoacid.Aminoacid
import com.fabiojuchem.processorapi.domain.aminoacid.repository.AminoacidRepository
import com.fabiojuchem.processorapi.domain.converter.Input
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class AminoacidConverter(
    val aminoacidRepository: AminoacidRepository
) {

    fun convert(input: Input): Mono<List<String>> {
        return Mono.just(input)
            .map {
                processInput(input)
            }

    }

    fun processInput(input: Input): List<String> {
        return input.value.toLowerCase().split(Regex("[a-z]{3}"))
    }

    fun getAminoacids(): Flux<Aminoacid> {
        return aminoacidRepository.findAll()
    }

}