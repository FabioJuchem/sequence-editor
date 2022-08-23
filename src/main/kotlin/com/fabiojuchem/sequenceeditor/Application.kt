package com.fabiojuchem.sequenceeditor

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@ComponentScan(basePackages = ["com.fabiojuchem"])
@EnableWebFlux
class Application

public fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
