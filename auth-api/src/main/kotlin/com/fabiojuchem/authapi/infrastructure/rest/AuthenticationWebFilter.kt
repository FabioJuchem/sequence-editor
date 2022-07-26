package com.fabiojuchem.authapi.infrastructure.rest

import org.springframework.stereotype.Component
import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilterChain
import reactor.core.publisher.Mono
import com.auth0.jwt.exceptions.JWTCreationException

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import org.springframework.boot.web.servlet.DispatcherType
import org.springframework.core.annotation.Order
import org.springframework.web.server.WebFilter
import javax.servlet.Filter
import javax.servlet.FilterChain
import javax.servlet.ServletRequest
import javax.servlet.ServletResponse
import java.util.Enumeration

import javax.servlet.http.HttpServletRequest

import javax.servlet.http.HttpServletResponse


@Component
@Order(-100)
class AuthenticationWebFilter: Filter {

    // TODO Adicionar verificação de token
    override fun doFilter(request: ServletRequest?, response: ServletResponse?, chain: FilterChain?) {
        val request = request as HttpServletRequest
        val httpRequest = request
        val headerNames = httpRequest.headerNames

        if (headerNames != null) {
            while (headerNames.hasMoreElements()) {
                val name = headerNames.nextElement()
                println("Header: " + name + " value:" + httpRequest.getHeader(name))
            }
        }
    }

    // TODO Exemplo de codificação de token
    fun applyFilter() {
        try {
            val algorithm: Algorithm = Algorithm.HMAC256("secret")
            val token = JWT.create()
                    .withIssuer("auth0")
                    .sign(algorithm)
        } catch (exception: JWTCreationException) {
            //Invalid Signing configuration / Couldn't convert Claims.
        }
    }



}