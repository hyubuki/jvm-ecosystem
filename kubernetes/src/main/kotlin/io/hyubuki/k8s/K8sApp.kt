package io.hyubuki.k8s

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.hyubuki.app", "io.hyubuki.k8s"])
class K8sApp

fun main() {
    runApplication<K8sApp>()
}
