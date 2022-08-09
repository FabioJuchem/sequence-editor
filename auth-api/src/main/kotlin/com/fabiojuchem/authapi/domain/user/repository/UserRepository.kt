package com.fabiojuchem.authapi.domain.user.repository

import com.fabiojuchem.authapi.domain.user.UserAccount
import org.springframework.data.r2dbc.repository.Modifying
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import reactor.core.publisher.Mono
import java.util.*

interface UserRepository: R2dbcRepository<UserAccount, UUID> {

    fun findByUsernameAndPassword(username: String, password: String): Mono<UserAccount?>

    @Modifying
    @Query("""insert into user_account (id, username, password, name, email) values (:#{#user.id}, :#{#user.username}, :#{#user.password}, :#{#user.name}, :#{#user.email})""")
    fun save(user: UserAccount): Mono<Void>
}