package hyubuki.simple

import hyubuki.simple.producer.CustomProducer
import hyubuki.simple.producer.SimpleProducer

fun main() {

    /** Simple Consumer */
//    val consumer = SimpleConsumer<String, String>()
//    consumer.doPolling()


    /** Custom Producer */
    val customProducer = CustomProducer<String, String>()
    customProducer.sendValue("testMessage2")
    customProducer.sendValue(0, "some-key", "testMessage2")
    customProducer.closeAndFlush()


    /** Simple Producer */
    val simpleProducer = SimpleProducer<String, String>()
    simpleProducer.sendValue("testMessage")
    simpleProducer.closeAndFlush()
}