package com.main.real.data.service.customer.integration.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty


data class AccountRequest(
    var number:Long,
    @JsonProperty("status")
    var status: AccountStatusEnum,
)