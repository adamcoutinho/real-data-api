package com.main.real.data.service.event.stream.integration

import com.main.real.data.service.card.integration.dto.CardRequest
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(name ="orchestrator-card", url = "http://localhost:8082/orchestrator")
interface CardOrchestratorService {
    @PostMapping("/card/register")
    fun register(request:CardRequest):String
}