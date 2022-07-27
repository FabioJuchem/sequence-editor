package com.fabiojuchem.authapi

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.stereotype.Component

@Component
@ComponentScan(basePackageClasses = [ScanAuthApiApplication::class])
@EntityScan(basePackageClasses = [ScanAuthApiApplication::class])
@EnableR2dbcRepositories(basePackageClasses = [ScanAuthApiApplication::class])
class ScanAuthApiApplication {
}