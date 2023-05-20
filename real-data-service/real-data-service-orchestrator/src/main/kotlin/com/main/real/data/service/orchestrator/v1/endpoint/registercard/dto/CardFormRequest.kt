package com.main.real.data.service.orchestrator.v1.endpoint.registercard.dto

import com.main.real.data.service.orchestrator.v1.persistence.table.Card
import com.main.real.data.service.orchestrator.v1.persistence.table.CardStatusEnum

data class CardFormRequest(
    val number:String,
    val dac:String,
    val status: CardStatusEnum,
) {

    fun toEntity() = Card(
        number = this.number,
        dac = this.dac,
        status = this.status
    )

}