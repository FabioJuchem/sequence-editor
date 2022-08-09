package com.fabiojuchem.authapi.infrastructure.rest

import com.fabiojuchem.authapi.domain.token.repository.TokenRepository
import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilter
import org.springframework.web.server.WebFilterChain
import reactor.core.publisher.Mono
import reactor.util.context.Context

const val USER_LOGGED_IN = "userLoggedIn"


@Component
class AuthenticationWebFilter: WebFilter {
    override fun filter(exchange: ServerWebExchange, chain: WebFilterChain): Mono<Void> {
        return chain.filter(exchange)
                .contextWrite {
                    checkAuthorizationContext(it, exchange.request.headers["Authorization"]?.firstOrNull())
                }
    }

    fun checkAuthorizationContext(context: Context, headerValue: String?): Context {
        return  headerValue?.let { checkUserLoggedIn(context, it) } ?: context
    }


    private fun checkUserLoggedIn(context: Context, headerValue: String): Context {
        val token =  headerValue.split(" ")[1]
        return context.put(USER_LOGGED_IN, token)

    }
}