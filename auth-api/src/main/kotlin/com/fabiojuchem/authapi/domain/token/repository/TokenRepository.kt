package com.fabiojuchem.authapi.domain.token.repository

import com.fabiojuchem.authapi.domain.token.Token
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono
import java.util.*

interface TokenRepository : JpaRepository<Token, UUID> {

    fun findByToken(token: String): Token?
}