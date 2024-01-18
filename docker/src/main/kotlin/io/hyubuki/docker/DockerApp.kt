package io.hyubuki.docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.hyubuki.app", "io.hyubuki.docker"])
class DockerApp

fun main() {
    runApplication<DockerApp>()
}
