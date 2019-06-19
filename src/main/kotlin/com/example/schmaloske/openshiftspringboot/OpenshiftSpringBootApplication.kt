package com.example.schmaloske.openshiftspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OpenshiftSpringBootApplication

fun main(args: Array<String>) {
	runApplication<OpenshiftSpringBootApplication>(*args)
}
