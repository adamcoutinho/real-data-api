package com.main.real.data.service.orchestrator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class RealDataServiceOrchestratorApplication

fun main(args: Array<String>) {
    runApplication<RealDataServiceOrchestratorApplication>(*args)
}
