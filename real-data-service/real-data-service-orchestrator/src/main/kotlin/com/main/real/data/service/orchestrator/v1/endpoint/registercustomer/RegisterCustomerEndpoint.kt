package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer

import com.main.real.data.service.orchestrator.v1.business.CustomerBusiness
import com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto.FormRequest
import com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto.RegisterCustomerDetailResponse
import com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto.toDetailResopnse
import jakarta.validation.Valid
import java.net.URI
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class RegisterCustomerEndpoint(private val customerBusiness: CustomerBusiness) {

    @PostMapping("/register")
    fun register(@RequestBody @Valid request: FormRequest): ResponseEntity<Any> {

        val newCustomerData =   this.customerBusiness.save(
            data = request.toCustomerData()
        )

        return ResponseEntity.created(URI.create("/customer/register")).body(newCustomerData.toDetailResopnse())
    }

    @GetMapping("/find/{id}")
    fun find(@PathVariable("id") id:Long):ResponseEntity<RegisterCustomerDetailResponse> {
        val newCustomerData =    this.customerBusiness.findById(id)
        return ResponseEntity.ok().body(newCustomerData.toDetailResopnse())
    }

}