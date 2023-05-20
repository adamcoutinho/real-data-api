package com.main.real.data.service.customer.v1.endpoint.registercustomer

import com.main.real.data.service.customer.integration.registercustomer.dto.RegisterCustomerOrchestratorService
import com.main.real.data.service.customer.v1.endpoint.registercustomer.dto.FormRequest
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class RegisterCustomerEndpoint(private val registerCustomerFeignClient: RegisterCustomerOrchestratorService) {

    @PostMapping("/register")
    fun customer(@RequestBody @Valid request:FormRequest):ResponseEntity<Any> {
        val fullName = this.registerCustomerFeignClient.post(request.toRequest())

        return ResponseEntity.ok(fullName)
    }
}