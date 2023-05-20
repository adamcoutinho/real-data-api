package com.main.real.data.service.customer.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.customer.integration.registercustomer.dto.AddressRequest


data class AddressFormRequest (
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
) {

    fun toAddressRequest() = AddressRequest(
        city=this.city,
        name=this.name,
        number=this.number,
        neighborhood=this.neighborhood,
        cep=this.cep
    )

}