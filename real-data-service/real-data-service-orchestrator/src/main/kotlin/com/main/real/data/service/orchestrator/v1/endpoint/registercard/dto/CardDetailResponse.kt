package com.main.real.data.service.orchestrator.v1.endpoint.registercard.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.Card

class CardDetailResponse(
    @JsonProperty("card_detail")
    val cardToString: String)