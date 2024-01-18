package io.hyubuki

import mu.KotlinLogging
import io.hyubuki.log.infoGreen

class KotlinLoggerExtensionTest

val log = KotlinLogging.logger {  }

fun main() {
    io.hyubuki.log.infoGreen { "hello this message color is greent" }
}