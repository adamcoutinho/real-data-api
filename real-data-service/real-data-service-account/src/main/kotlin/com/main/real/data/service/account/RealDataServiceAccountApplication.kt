package com.main.real.data.service.account

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RealDataServiceAccountApplication

fun main(args: Array<String>) {
    runApplication<RealDataServiceAccountApplication>(*args)
}
