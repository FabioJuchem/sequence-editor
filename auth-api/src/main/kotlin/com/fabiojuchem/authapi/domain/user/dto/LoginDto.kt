package com.fabiojuchem.authapi.domain.user.dto

import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class LoginDto(
        @field:NotNull(message = "username is required")
        @field:NotBlank(message = "username is required")
        val username: String,

        @field:NotNull(message = "password is required")
        @field:NotBlank(message = "password is required")
        val password: String,
)