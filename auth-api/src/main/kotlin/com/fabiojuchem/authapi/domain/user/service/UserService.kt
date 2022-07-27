package com.fabiojuchem.authapi.domain.user.service

import com.fabiojuchem.authapi.domain.token.Token
import com.fabiojuchem.authapi.domain.token.TokenBuilder
import com.fabiojuchem.authapi.domain.token.repository.TokenRepository
import com.fabiojuchem.authapi.domain.user.TokenDetails
import com.fabiojuchem.authapi.domain.user.UserAccount
import com.fabiojuchem.authapi.domain.user.dto.UserDto
import com.fabiojuchem.authapi.domain.user.repository.UserRepository
import com.fabiojuchem.authapi.infrastructure.exception.LoginInvalidException
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(
        private val userRepository: UserRepository,
        private val tokenRepository: TokenRepository
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun createUser(dto: UserDto): Mono<Void> {
        return userRepository.save(dto.toUser())
                .doOnSuccess { logger.info("m=createUser, username=${dto.username}") }
                .doOnError { logger.error("m=createUser, message=${it.message}") }
    }

    fun login(user: UserDto): Mono<String> {
          return findUserAccount(user)
                 .flatMap { findUser(it!!) }
                 .flatMap {
                     val finalToken = it.token
                     finalToken.renew()
                     persistTokenData(it)
                             .thenReturn(finalToken.token)
                 }
                  .doOnSuccess { logger.info("m=login, message=Logged with success") }
                  .doOnError { logger.error("m=login, message=${it.message}") }
    }

    private fun findUserAccount(user: UserDto) =
            userRepository.findByUsernameAndPassword(user.username, TokenBuilder.hashSecret(user.password))
                    .switchIfEmpty(Mono.error(LoginInvalidException("user account is invalid")))

    private fun persistTokenData(token: TokenDetails) = if (token.isNew) tokenRepository.save(token.token) else tokenRepository.update(token.token)

    private fun findUser(it: UserAccount) =
            tokenRepository.findByUserId(it.id)
                    .map { token -> TokenDetails(token!!, it, false) }
                    .switchIfEmpty(Mono.just(TokenDetails(Token(TokenBuilder.build(), it.id), it, true)))
}