package com.fabiojuchem.processorapi

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.stereotype.Component

@Component
@ComponentScan(basePackageClasses = [ScanProcessorApiApplication::class])
@EntityScan(basePackageClasses = [ScanProcessorApiApplication::class])
class ScanProcessorApiApplication {
}