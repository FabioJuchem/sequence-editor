package com.fabiojuchem.processorapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProcessorApiApplication

fun main(args: Array<String>) {
	runApplication<ProcessorApiApplication>(*args)
}
