package com.fabiojuchem.authapi.resource.rest

import com.fabiojuchem.authapi.domain.user.dto.LoginDto
import com.fabiojuchem.authapi.domain.user.dto.TokenDto
import com.fabiojuchem.authapi.domain.user.dto.UserDetailsDto
import com.fabiojuchem.authapi.domain.user.dto.UserDto
import com.fabiojuchem.authapi.domain.user.service.UserService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
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

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/login")
    fun login(@RequestBody dto: LoginDto) = userService.login(dto)

    @GetMapping("/user")
    fun getUserData(): Mono<UserDetailsDto> {
        return userService.findUserByToken()
    }

}