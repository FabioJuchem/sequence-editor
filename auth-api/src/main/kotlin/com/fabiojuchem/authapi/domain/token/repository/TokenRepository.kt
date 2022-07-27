package com.fabiojuchem.authapi.domain.token.repository

import com.fabiojuchem.authapi.domain.token.Token
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.util.*

interface TokenRepository : R2dbcRepository<Token, UUID> {

    fun findByToken(token: String): Mono<Token?>
}