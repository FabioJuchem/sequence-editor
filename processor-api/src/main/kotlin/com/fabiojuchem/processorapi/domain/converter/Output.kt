package com.fabiojuchem.processorapi.domain.converter

import com.fasterxml.jackson.annotation.JsonProperty

data class Output(
        @field:JsonProperty("value")
        val value: String
)