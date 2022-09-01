package com.fabiojuchem.processorapi.domain.converter.converters

import com.fabiojuchem.processorapi.domain.aminoacid.Aminoacid
import com.fabiojuchem.processorapi.domain.aminoacid.repository.AminoacidRepository
import com.fabiojuchem.processorapi.domain.converter.Input
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class AminoacidConverter(
    private val aminoacidRepository: AminoacidRepository
) {

    fun convert(input: Input): Mono<Triple<MutableList<String>, MutableList<String>, MutableList<String>>> {
        return Mono.just(input)
            .map {
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
                        getAminoacidSequence(triple.first, sequenceOne, it)
                        getAminoacidSequence(triple.second, sequenceTwo, it)
                        getAminoacidSequence(triple.third, sequenceThree, it)
                        Triple(sequenceOne,sequenceTwo,sequenceThree)
                    }
            }


    }

    private fun getAminoacidSequence(
        it: List<String>,
        sequenceOne: MutableList<String>,
        aminoacids: List<Aminoacid>
    ) {
        it.forEach { value ->
            sequenceOne.add(aminoacids.filter { aminoacid: Aminoacid -> value == aminoacid.rnaCodon }.first()?.symbol)
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