package com.fabiojuchem.appmain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@ComponentScan(basePackages = ["com.fabiojuchem"])
@EnableWebFlux
class AppmainApplication {

	companion object {
		fun main(args: Array<String>) {
			runApplication<AppmainApplication>(*args)
		}
	}

}


