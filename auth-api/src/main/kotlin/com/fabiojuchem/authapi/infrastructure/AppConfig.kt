package com.fabiojuchem.authapi.infrastructure

import com.fabiojuchem.authapi.infrastructure.rest.AuthenticationWebFilter
import org.springframework.boot.autoconfigure.security.SecurityProperties
import org.springframework.context.annotation.Configuration
import org.springframework.core.annotation.Order
import org.springframework.http.HttpMethod
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter


@EnableWebSecurity
@Configuration
@Order(SecurityProperties.DEFAULT_FILTER_ORDER)
class AppConfig(
        val authenticationWebFilter: AuthenticationWebFilter
) : WebSecurityConfigurerAdapter() {

    @Override
    override fun configure(http: HttpSecurity) {
        http
                .csrf().disable()
                .addFilterBefore(authenticationWebFilter, BasicAuthenticationFilter::class.java)
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/*").permitAll()
                .antMatchers("/*")
                .permitAll()
                .filterSecurityInterceptorOncePerRequest(true)
    }
}