package com.fabiojuchem.authapi

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Component

@Component
@ComponentScan(basePackageClasses = [ScanAuthApiApplication::class])
@EnableJpaRepositories(basePackageClasses = [ScanAuthApiApplication::class])
@EntityScan(basePackageClasses = [ScanAuthApiApplication::class])
class ScanAuthApiApplication {
}