package com.fabiojuchem.appmain

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan(basePackages = ["com.fabiojuchem"])
class AppmainApplication

fun main(args: Array<String>) {
	runApplication<AppmainApplication>(*args)
}
