package com.fabiojuchem.processorapi.resource

import com.fabiojuchem.processorapi.domain.converter.ConverterType
import com.fabiojuchem.processorapi.domain.converter.Input
import com.fabiojuchem.processorapi.domain.converter.service.ConverterService
import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

@RestController
class ConverterResource(
        private val converterService: ConverterService
) {

    @PostMapping("/convert/{type}", produces = [MediaType.APPLICATION_JSON_VALUE] )
    fun convert(@RequestBody input: Input, @PathVariable type: ConverterType) =
        converterService.convert(input, type)

}