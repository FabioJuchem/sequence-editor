package com.fabiojuchem.authapi.domain.token.repository

import com.fabiojuchem.authapi.domain.token.Token
import com.fabiojuchem.authapi.domain.user.UserAccount
import org.springframework.data.r2dbc.repository.Modifying
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono
import java.util.*

interface TokenRepository : R2dbcRepository<Token, UUID> {

    fun findByToken(token: String): Mono<Token?>

    fun findByUserId(id: UUID): Mono<Token?>

    @Modifying
    @Query("""insert into token (id, "token", created_at, expires_in, user_account_id) values (:#{#token.id}, :#{#token.token}, :#{#token.createdAt}, :#{#token.expiresIn}, :#{#token.userId})""")
    fun save(token: Token): Mono<Token>

    @Modifying
    @Query("""update token set "token" = :#{#token.token}, created_at = :#{#token.createdAt}, expires_in = :#{#token.expiresIn} where id = :#{#token.id}""")
    fun update(token: Token): Mono<Token>
}