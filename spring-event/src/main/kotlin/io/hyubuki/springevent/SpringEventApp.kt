package io.hyubuki.springevent

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SpringEventApp

fun main() {
    runApplication<SpringEventApp>()
}