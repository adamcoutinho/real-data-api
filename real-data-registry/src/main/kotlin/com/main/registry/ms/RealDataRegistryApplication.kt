package com.main.registry.ms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class RealDataRegistryApplication

fun main(args: Array<String>) {
	runApplication<RealDataRegistryApplication>(*args)
}
