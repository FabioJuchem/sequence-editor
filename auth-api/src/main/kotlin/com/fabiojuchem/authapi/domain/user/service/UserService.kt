package com.fabiojuchem.authapi.domain.user.service

import com.fabiojuchem.authapi.domain.user.UserAccount
import com.fabiojuchem.authapi.domain.user.dto.UserDto
import com.fabiojuchem.authapi.domain.user.repository.UserRepository
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class UserService(
        private val userRepository: UserRepository
) {
    private val logger = LoggerFactory.getLogger(this::class.java)

    fun createUser(dto: UserDto): Mono<Void> {
        return userRepository.save(dto.toUser())
                .doOnSuccess { logger.info("m=createUser, username=${dto.username}") }
                .doOnError { logger.error("m=createUser, message=${it.message}") }
    }
}