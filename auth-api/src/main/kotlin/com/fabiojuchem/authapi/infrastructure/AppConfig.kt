package com.fabiojuchem.authapi.infrastructure

import com.fabiojuchem.authapi.infrastructure.rest.AuthenticationWebFilter
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.http.HttpMethod
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

import org.springframework.web.server.WebFilterChain

import org.springframework.web.server.ServerWebExchange
import org.springframework.web.server.WebFilter

import reactor.core.publisher.Mono



//@EnableWebSecurity
//@Configuration
//@Order(SecurityProperties.DEFAULT_FILTER_ORDER)
//class AppConfig(
//        val authenticationWebFilter: AuthenticationWebFilter
//) : WebSecurityConfigurerAdapter() {
//
//    @Override
//    override fun configure(http: HttpSecurity) {
//        http
//                .csrf().disable()
//                .authorizeRequests()
//                .antMatchers(HttpMethod.OPTIONS, "/*").permitAll()
//                .antMatchers("/*")
//                .permitAll()
//    }
//}