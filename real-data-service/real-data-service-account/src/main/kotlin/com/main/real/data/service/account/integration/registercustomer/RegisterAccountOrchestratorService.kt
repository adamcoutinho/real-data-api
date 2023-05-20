package com.main.real.data.service.account.integration.registercustomer

import com.main.real.data.service.account.integration.registercustomer.dto.AccountRequest
import jakarta.annotation.PostConstruct
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name ="orchestrator-card", url = "http://localhost:8082/orchestrator")
interface RegisterAccountOrchestratorService {

    @PostMapping("/account/register")
    fun post(request:AccountRequest):Any
}