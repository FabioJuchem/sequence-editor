package com.fabiojuchem.appmain

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = ["com.fabiojuchem.appmain", "com.fabiojuchem.authapi", "com.fabiojuchem.common", "com.fabiojuchem.processorapi"])
@EnableWebFlux
class AppmainApplication

fun main(args: Array<String>) {
	runApplication<AppmainApplication>(*args)
}
