package com.main.real.data.service.event.stream.integration.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CardRequest(

    @JsonProperty("number")
    val number:String,
    @JsonProperty("dac")
    val dac:String,
    @JsonProperty("status")
    val status: CardStatusEnum,
)