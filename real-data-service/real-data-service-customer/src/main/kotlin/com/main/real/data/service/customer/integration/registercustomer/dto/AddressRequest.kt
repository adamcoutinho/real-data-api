package com.main.real.data.service.customer.integration.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class AddressRequest (
    @JsonProperty("city")
    var city:String,
    @JsonProperty("name")
    var name:String,
    @JsonProperty("number")
    var number:Long,
    @JsonProperty("neighborhood")
    var neighborhood:String,
    @JsonProperty("cep")
    var cep: String
)