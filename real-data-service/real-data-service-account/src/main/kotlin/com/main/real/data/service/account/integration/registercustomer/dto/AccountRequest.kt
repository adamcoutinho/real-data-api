package com.main.real.data.service.account.integration.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty



class AccountRequest(
    @JsonProperty("number")
    val number:Long,
    @JsonProperty("status")
    val status: AccountStatusEnum,
)