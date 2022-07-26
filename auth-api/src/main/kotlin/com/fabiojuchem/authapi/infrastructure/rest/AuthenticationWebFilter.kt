package com.fabiojuchem.authapi.infrastructure.rest

import com.fabiojuchem.authapi.domain.token.TokenBuilder
import com.fabiojuchem.authapi.domain.token.repository.TokenRepository
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import reactor.core.publisher.Mono
import reactor.util.context.Context
import java.util.*
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import javax.servlet.http.HttpServletRequest

const val USER_LOGGED_IN = "userLoggedIn"


@Component
@Order(-100)
class AuthenticationWebFilter(
        private val tokenRepository: TokenRepository
): Filter {

    // TODO Adicionar verificação de token
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        Mono.justOrEmpty(request)
                .contextWrite {
                    val request = request as HttpServletRequest
                    if (request.headerNames.toList().contains("Authorization")) {
                       checkUserLoggedIn(it, request.getHeader("Authorization"))
                    } else {
                        it
                    }
                }

    }

    private fun checkUserLoggedIn(context: Context, headerValue: String): Context {
        val credentials =  headerValue.split(" ")[1]
        val decodedBytes: ByteArray = Base64.getDecoder().decode(credentials)
        val decodedString = String(decodedBytes)
        val token = TokenBuilder.hashSecret(decodedString.split(":")[1])
        val tokenFetched = tokenRepository.findByToken(token)
        return tokenFetched?.let { context.put(USER_LOGGED_IN, it.user) } ?: context

    }
}