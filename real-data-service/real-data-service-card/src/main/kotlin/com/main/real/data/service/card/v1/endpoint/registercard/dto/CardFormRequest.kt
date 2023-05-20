package com.main.real.data.service.card.v1.endpoint.registercard.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.card.integration.dto.CardRequest
import com.main.real.data.service.card.integration.dto.CardStatusEnum

data class CardFormRequest(
    @JsonProperty("number")
    val number:String,
    @JsonProperty("dac")
    val dac:String,
    @JsonProperty("status")
    val status: CardStatusEnum,
) {

    fun toCardRequest() = CardRequest(
        number = this.number,
        dac = this.dac,
        status= this.status
    )

}