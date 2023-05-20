package com.main.real.data.service.customer.integration.registercustomer.dto

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name="orchestrator-registercustomer", url="http://localhost:8082/orchestrator")
interface RegisterCustomerOrchestratorService {

    @PostMapping("/customer/register")
    fun post(request:FormRequest):String
}