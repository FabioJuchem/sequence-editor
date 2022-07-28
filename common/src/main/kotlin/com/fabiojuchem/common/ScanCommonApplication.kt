package com.fabiojuchem.common

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories
import org.springframework.stereotype.Component

@Component
@ComponentScan(basePackageClasses = [ScanCommonApplication::class])
@EntityScan(basePackageClasses = [ScanCommonApplication::class])
@EnableR2dbcRepositories(basePackageClasses = [ScanCommonApplication::class])
class ScanCommonApplication {
}