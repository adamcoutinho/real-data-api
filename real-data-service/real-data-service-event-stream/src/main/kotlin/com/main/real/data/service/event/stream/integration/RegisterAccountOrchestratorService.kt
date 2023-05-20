package com.main.real.data.service.event.stream.integration

import com.main.real.data.service.event.stream.integration.dto.AccountRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name ="orchestrator-card", url = "http://localhost:8082/orchestrator")
interface RegisterAccountOrchestratorService {

    @PostMapping("/account/register")
    fun post(request: AccountRequest):Any
}