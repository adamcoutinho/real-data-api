package com.main.real.data.service.orchestrator.v1.endpoint.registeraccount

import com.main.real.data.service.orchestrator.v1.endpoint.registeraccount.dto.AccountFormRequest
import com.main.real.data.service.orchestrator.v1.persistence.repository.AccountJpaRepository
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterAccountEndpoint(private val accountJpaRepository: AccountJpaRepository) {

    @PostMapping("/account/register")
    fun post(@RequestBody @Valid request: AccountFormRequest): ResponseEntity<Any> {
        val accountRegistered=  this.accountJpaRepository.save(request.toEntity())
        val map = accountRegistered.number to accountRegistered.accountStatusEnum.name
        return  ResponseEntity.ok().body(map)
    }
}