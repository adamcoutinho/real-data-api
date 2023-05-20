package com.main.real.data.service.orchestrator.v1.endpoint.registeraccount.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.Account
import com.main.real.data.service.orchestrator.v1.persistence.table.AccountStatusEnum


class AccountFormRequest(
    @JsonProperty("number")
    val number:Long,
    @JsonProperty("status")
    val accountStatusEnum: AccountStatusEnum,
) {

    fun toEntity() = Account(
        number=this.number,
        accountStatusEnum = this.accountStatusEnum
    )
}