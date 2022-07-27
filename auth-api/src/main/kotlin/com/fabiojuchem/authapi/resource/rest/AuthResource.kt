package com.fabiojuchem.authapi.resource.rest

import com.fabiojuchem.authapi.domain.user.dto.UserDto
import com.fabiojuchem.authapi.domain.user.service.UserService
import jdk.jfr.ContentType
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.support.WebExchangeBindException
import reactor.core.publisher.Mono
import javax.validation.Valid

@RestController
@RequestMapping("/auth")
class AuthResource(
       val userService: UserService,
) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    fun createUser(@RequestBody @Valid dto: UserDto) = userService.createUser(dto)
    //TODO verificar porque o @Valid não esta funcionando

}