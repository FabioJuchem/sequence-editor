package com.fabiojuchem.authapi.domain.user

import com.fabiojuchem.authapi.domain.token.Token

data class TokenDetails(
        val token: Token,
        val userAccount: UserAccount,
        val isNew: Boolean
)