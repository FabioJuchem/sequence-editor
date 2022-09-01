package com.fabiojuchem.processorapi.resource

import com.fabiojuchem.processorapi.domain.aminoacid.AminoacidOption
import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.decorators.DecoratorType
import com.fabiojuchem.processorapi.domain.converter.service.AminoacidConverterService
import com.fabiojuchem.processorapi.domain.converter.service.ConverterService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
class ConverterResource(
        private val converterService: ConverterService,
        private val aminoacidConverterService: AminoacidConverterService
) {

    @PostMapping("/convert/{type}", produces = [MediaType.APPLICATION_JSON_VALUE] )
    fun convert(
            @RequestBody input: Input,
            @PathVariable type: ConverterType,
            @RequestParam options: List<DecoratorType>
    ) =
        converterService.convert(input, type, options)

    @PostMapping("/convert/aminoacid", produces = [MediaType.APPLICATION_JSON_VALUE] )
    fun convertAminoacid(
        @RequestBody input: Input,
    ) = aminoacidConverterService.convertAminoacid(input)


}