package com.main.real.data.service.event.stream

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RealDataServiceEventStreamApplication

fun main(args: Array<String>) {
    runApplication<RealDataServiceEventStreamApplication>(*args)
}
