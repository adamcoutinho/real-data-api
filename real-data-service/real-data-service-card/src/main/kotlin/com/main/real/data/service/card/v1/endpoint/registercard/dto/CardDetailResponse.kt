package com.main.real.data.service.card.v1.endpoint.registercard.dto

import com.fasterxml.jackson.annotation.JsonProperty

class CardDetailResponse(
    @JsonProperty("card_detail")
    val cardToString: String)