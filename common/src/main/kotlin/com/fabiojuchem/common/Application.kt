package com.fabiojuchem.common

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
class AppmainApplication

fun main(args: Array<String>) {
	runApplication<AppmainApplication>(*args)
}
