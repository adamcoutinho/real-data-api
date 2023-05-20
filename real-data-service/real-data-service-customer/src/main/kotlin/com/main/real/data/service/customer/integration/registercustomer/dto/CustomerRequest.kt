package com.main.real.data.service.customer.integration.registercustomer.dto


import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

data class CustomerRequest(
    @JsonProperty("full_name")
    @NotBlank
    var fullname:String,
    @JsonProperty("first_name")
    @NotBlank
    var firstName:String,
    @JsonProperty("last_name")
    @NotBlank
    var lastName:String,
    @JsonProperty("birthday")
    @NotBlank
    var birthDate: LocalDate?=null,
)