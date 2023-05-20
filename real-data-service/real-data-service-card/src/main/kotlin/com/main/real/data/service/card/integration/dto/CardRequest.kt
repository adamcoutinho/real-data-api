package com.main.real.data.service.card.integration.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CardRequest(

    @JsonProperty("number")
    val number:String,
    @JsonProperty("dac")
    val dac:String,
    @JsonProperty("status")
    val status: CardStatusEnum,
)