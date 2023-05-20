package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.Address

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

    fun toEntity() = Address(
        name=this.name,
        cep=this.cep,
        number=this.number,
        neighborhood = this.neighborhood,
        city = this.city
    )

}