package com.main.real.data.service.authpass

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RealDataServiceAuthpassApplication

fun main(args: Array<String>) {
    runApplication<RealDataServiceAuthpassApplication>(*args)
}
