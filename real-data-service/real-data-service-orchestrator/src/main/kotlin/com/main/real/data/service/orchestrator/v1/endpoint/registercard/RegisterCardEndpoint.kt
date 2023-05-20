package com.main.real.data.service.orchestrator.v1.endpoint.registercard

import com.main.real.data.service.orchestrator.v1.endpoint.registercard.dto.CardDetailResponse
import com.main.real.data.service.orchestrator.v1.endpoint.registercard.dto.CardFormRequest
import com.main.real.data.service.orchestrator.v1.persistence.repository.CardJpaRepository
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterCardEndpoint(private val cardJpaRepository: CardJpaRepository){

    @PostMapping("/card/register")
    fun post(@RequestBody @Valid request: CardFormRequest): ResponseEntity<Any>  {
        val card= this.cardJpaRepository.save(request.toEntity())
        return ResponseEntity.ok().body(CardDetailResponse(
            cardToString = card.toString()
        ))
    }
}