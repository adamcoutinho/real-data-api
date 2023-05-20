package com.main.real.data.service.customer.v1.endpoint.registercustomer.dto

import com.main.real.data.service.customer.integration.registercustomer.dto.CardRequest
import com.main.real.data.service.customer.integration.registercustomer.dto.CardStatusEnum

data class CardFormRequest(
    val number:String,
    val dac:String,
    val status: CardStatusEnum,
){

    fun toCardRequest() = CardRequest(
        number=this.number,
        dac=this.dac,
        status=this.status
    )

}