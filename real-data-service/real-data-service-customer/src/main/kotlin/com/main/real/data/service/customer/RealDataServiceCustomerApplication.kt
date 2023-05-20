package com.main.real.data.service.customer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RealDataServiceCustomerApplication

fun main(args: Array<String>) {
    runApplication<RealDataServiceCustomerApplication>(*args)
}
