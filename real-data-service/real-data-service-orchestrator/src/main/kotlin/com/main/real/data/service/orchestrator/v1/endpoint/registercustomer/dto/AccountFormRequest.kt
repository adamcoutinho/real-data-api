package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.Account
import com.main.real.data.service.orchestrator.v1.persistence.table.AccountStatusEnum

data class AccountFormRequest(
    var number:Long,
    @JsonProperty("status")
    var accountStatusEnum: AccountStatusEnum,
) {
    fun toAccountEntity() = Account(
        number= number,
        accountStatusEnum = AccountStatusEnum.UNLOCKED
    )
}