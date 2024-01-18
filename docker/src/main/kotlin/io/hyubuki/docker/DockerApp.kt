package io.hyubuki.docker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.hyubuki.app"])
class DockerApp

fun main() {
    runApplication<DockerApp>()
}
