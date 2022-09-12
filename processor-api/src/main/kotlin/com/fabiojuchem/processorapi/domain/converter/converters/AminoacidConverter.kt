package com.fabiojuchem.processorapi.domain.converter.converters

import com.fabiojuchem.processorapi.domain.aminoacid.Aminoacid
import com.fabiojuchem.processorapi.domain.aminoacid.FetchType
import com.fabiojuchem.processorapi.domain.aminoacid.repository.AminoacidRepository
import com.fabiojuchem.processorapi.domain.converter.Input
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class AminoacidConverter(
    private val aminoacidRepository: AminoacidRepository
) {

    fun convert(input: Input, direction: Boolean, options: FetchType): Mono<Triple<String, String, String>> {
        return Mono.just(input)
            .map {
                if (direction) input.value = input.value.reversed()
                Triple(
                    processInput(input.value, mutableListOf()),
                    processInput(input.value.drop(1), mutableListOf()),
                    processInput(input.value.drop(2), mutableListOf())
                )
            }.flatMap { triple ->
                getAminoacids().collectList()
                    .map {
                        var sequenceOne = mutableListOf<String>()
                        var sequenceTwo = mutableListOf<String>()
                        var sequenceThree = mutableListOf<String>()
                        getAminoacidSequence(triple.first, sequenceOne, it, options)
                        getAminoacidSequence(triple.second, sequenceTwo, it, options)
                        getAminoacidSequence(triple.third, sequenceThree, it, options)
                        Triple(convertToString(sequenceOne), convertToString(sequenceTwo), convertToString(sequenceThree))
                    }
            }
    }

    private fun convertToString(sequenceOne: MutableList<String>) =
        sequenceOne.joinToString().replace(",", "")

    private fun getAminoacidSequence(
        it: List<String>,
        sequence: MutableList<String>,
        aminoacids: List<Aminoacid>,
        options: FetchType
    ) {
        try {
            it.forEach { value ->
                val sequenceFetched = aminoacids.filter {
                        aminoacid: Aminoacid -> value == aminoacid.rnaCodon
                }?.first()
                if (options == FetchType.ACRONYM) sequence.add(sequenceFetched?.initials) else sequence.add(sequenceFetched?.symbol)
            }
        } catch (e: Exception) {
            println(e)
        }

    }

    fun processInput(input: String, list: List<String>): List<String> {
        val list = mutableListOf<String>()
        // converter para rna
        var inputValue = input
        if (inputValue.length > 2 ) {
            list.add(inputValue.substring(0, 3))
            inputValue = inputValue.drop(3)
            list.addAll(processInput(inputValue, list))
        }
        return list
    }

    fun getAminoacids(): Flux<Aminoacid> {
        return aminoacidRepository.findAll()
    }

}