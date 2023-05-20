package com.main.real.data.service.card.v1.endpoint.registercard;

import com.main.real.data.service.card.integration.CardOrchestratorService
import com.main.real.data.service.card.v1.endpoint.registercard.dto.CardFormRequest
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterCardEndpoint(private val cardOrchestratorService: CardOrchestratorService) {

    @PostMapping("/register")
    fun post(@RequestBody @Valid request: CardFormRequest): ResponseEntity<Any> {
        return ResponseEntity.ok().body(this.cardOrchestratorService.register(request.toCardRequest()))
    }
}