package com.fabiojuchem.processorapi

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.stereotype.Component

@Component
@ComponentScan(basePackageClasses = [ScanProcessorApiApplication::class])
@EntityScan(basePackageClasses = [ScanProcessorApiApplication::class])
@EnableR2dbcRepositories(basePackageClasses = [ScanProcessorApiApplication::class])
class ScanProcessorApiApplication {
}