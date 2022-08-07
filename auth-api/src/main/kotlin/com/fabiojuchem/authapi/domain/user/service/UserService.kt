package com.fabiojuchem.authapi.domain.user.service

import com.fabiojuchem.authapi.domain.token.Token
import com.fabiojuchem.authapi.domain.token.TokenBuilder
import com.fabiojuchem.authapi.domain.token.repository.TokenRepository
import com.fabiojuchem.authapi.domain.user.TokenDetails
import com.fabiojuchem.authapi.domain.user.UserAccount
import com.fabiojuchem.authapi.domain.user.dto.LoginDto
import com.fabiojuchem.authapi.domain.user.dto.UserDetailsDto
import com.fabiojuchem.authapi.domain.user.dto.UserDto
import com.fabiojuchem.authapi.domain.user.repository.UserRepository
import com.fabiojuchem.authapi.infrastructure.exception.LoginInvalidException
import com.fabiojuchem.authapi.infrastructure.exception.UserSessionInvalidException
import com.fabiojuchem.authapi.infrastructure.rest.USER_LOGGED_IN
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono
import reactor.kotlin.core.publisher.toMono

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

    fun login(dto: LoginDto): Mono<String> {
          return findUserAccount(dto)
                 .flatMap { findToken(it!!) }
                 .flatMap {
                     val finalToken = it.token
                     finalToken.renew()
                     persistTokenData(it)
                             .thenReturn(finalToken.token)
                 }
                  .doOnSuccess { logger.info("m=login, message=Logged with success") }
                  .doOnError { logger.error("m=login, message=${it.message}") }
    }

    private fun findUserAccount(dto: LoginDto) =
            userRepository.findByUsernameAndPassword(dto.username, TokenBuilder.hashSecret(dto.password))
                    .switchIfEmpty(Mono.error(LoginInvalidException("user account is invalid")))

    private fun persistTokenData(token: TokenDetails) = if (token.isNew) tokenRepository.save(token.token) else tokenRepository.update(token.token)

    private fun findToken(it: UserAccount) =
            tokenRepository.findByUserId(it.id)
                    .map { token -> TokenDetails(token!!, it, false) }
                    .switchIfEmpty(Mono.just(TokenDetails(Token(TokenBuilder.build(), it.id), it, true)))

    fun findUserByToken(): Mono<UserDetailsDto> {
        return Mono.deferContextual {
                Mono.just(it.get<String>(USER_LOGGED_IN))
            }
            .map { it }
            .flatMap {
                tokenRepository.findByToken(it)
                    .flatMap { token ->
                        if (token != null) {
                            userRepository.findById(token.userId)
                                .map { user -> UserDetailsDto(user.name, user.email) }
                                .doOnSuccess { logger.info("m=findUserByToken, user=${it.name}") }
                        } else {
                            logger.error("m=findUserByToken, message=Failed to get userData")
                            throw UserSessionInvalidException()
                        }
                    }
            }
    }
}