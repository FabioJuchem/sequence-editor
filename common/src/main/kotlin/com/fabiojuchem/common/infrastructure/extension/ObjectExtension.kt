package com.fabiojuchem.common.infrastructure.extension

import com.fasterxml.jackson.databind.ObjectMapper



fun Any.toJsonString(): String {
    return ObjectMapper().writeValueAsString(this)
}
