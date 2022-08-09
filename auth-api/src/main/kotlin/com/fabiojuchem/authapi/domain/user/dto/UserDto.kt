package com.fabiojuchem.authapi.domain.user.dto

import com.fabiojuchem.authapi.domain.token.TokenBuilder
import com.fabiojuchem.authapi.domain.user.UserAccount
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class UserDto(
        @field:NotNull(message = "username is required")
        @field:NotBlank(message = "username is required")
        val username: String,

        @field:NotNull(message = "password is required")
        @field:NotBlank(message = "password is required")
        val password: String,

        @field:NotNull(message = "name is required")
        @field:NotBlank(message = "name is required")
        val name: String,

        @field:NotNull(message = "email is required")
        @field:NotBlank(message = "email is required")
        val email: String
) {
        fun toUser(): UserAccount {
                return UserAccount(username, TokenBuilder.hashSecret(password), name, email)
        }
}