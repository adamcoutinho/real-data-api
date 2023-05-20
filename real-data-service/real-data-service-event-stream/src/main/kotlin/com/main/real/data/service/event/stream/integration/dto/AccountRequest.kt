package com.main.real.data.service.event.stream.integration.dto

import com.fasterxml.jackson.annotation.JsonProperty



class AccountRequest(
    @JsonProperty("number")
    val number:Long,
    @JsonProperty("status")
    val status: AccountStatusEnum,
)