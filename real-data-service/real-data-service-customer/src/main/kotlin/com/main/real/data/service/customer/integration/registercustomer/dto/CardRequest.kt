package com.main.real.data.service.customer.integration.registercustomer.dto

data class CardRequest(
    val number:String,
    val dac:String,
    val status: CardStatusEnum,
)