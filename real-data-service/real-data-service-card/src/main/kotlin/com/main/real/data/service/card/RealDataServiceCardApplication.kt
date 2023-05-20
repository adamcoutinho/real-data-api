package com.main.real.data.service.card

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class RealDataServiceCardApplication

fun main(args: Array<String>) {
	runApplication<RealDataServiceCardApplication>(*args)
}
