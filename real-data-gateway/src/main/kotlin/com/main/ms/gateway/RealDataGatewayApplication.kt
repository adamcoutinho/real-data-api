package com.main.ms.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class RealDataGatewayApplication

fun main(args: Array<String>) {
    runApplication<RealDataGatewayApplication>(*args)
}
