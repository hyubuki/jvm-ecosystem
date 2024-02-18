package io.hyubuki

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JpaApp

fun main() {
    runApplication<JpaApp>()
}