package com.main.real.data.service.account.v1.endpoint.registeraccount

import com.main.real.data.service.account.integration.registercustomer.RegisterAccountOrchestratorService
import com.main.real.data.service.account.v1.endpoint.registeraccount.dto.AccountFormRequest
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterAccountEndpoint(private val service: RegisterAccountOrchestratorService){

    @PostMapping("/register")
    fun post(@RequestBody @Valid request: AccountFormRequest): ResponseEntity<Any> {
        val any =     this.service.post(request.toRequest())
        return  ResponseEntity.ok().body(any)
    }
}