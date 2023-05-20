package com.main.real.data.service.customer.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.customer.integration.registercustomer.dto.AccountRequest
import com.main.real.data.service.customer.integration.registercustomer.dto.AccountStatusEnum


data class AccountFormRequest(
    var number:Long,
    @JsonProperty("status")
    var status: AccountStatusEnum,
) {

    fun toAccountRequest() = AccountRequest(
        number = this.number,
        status=this.status
    )
}