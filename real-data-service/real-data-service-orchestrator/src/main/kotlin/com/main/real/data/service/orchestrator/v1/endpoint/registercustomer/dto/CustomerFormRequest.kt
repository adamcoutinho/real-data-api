package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.Customer
import jakarta.validation.constraints.NotBlank
import java.time.LocalDate

data class CustomerFormRequest(
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
) {

    fun toCustomerEntity() = Customer(
        fullname=this.fullname,
        firstName = this.firstName,
        lastName = this.lastName,
        birthDate = this.birthDate,
    )

}