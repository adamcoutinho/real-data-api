package com.main.real.data.service.account.v1.endpoint.registeraccount.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.account.integration.registercustomer.dto.AccountRequest
import com.main.real.data.service.account.integration.registercustomer.dto.AccountStatusEnum


class AccountFormRequest(
    @JsonProperty("number")
    val number:Long,
    @JsonProperty("status")
    val accountStatusEnum: AccountStatusEnum,
) {

    fun toRequest() = AccountRequest(
        number=this.number,
        status = this.accountStatusEnum
    )
}