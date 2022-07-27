package com.fabiojuchem.authapi.domain.user

import com.fabiojuchem.authapi.domain.token.Token
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

data class UserLoggedIn(
        val token: Token
)