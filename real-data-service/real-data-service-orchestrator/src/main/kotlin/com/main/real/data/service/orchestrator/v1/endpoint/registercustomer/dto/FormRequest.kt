package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.Card
import com.main.real.data.service.orchestrator.v1.persistence.table.CardStatusEnum

import com.main.real.data.service.orchestrator.v1.persistence.table.CustomerData

data class FormRequest(
    @JsonProperty("customer")
    val customerFormRequest: CustomerFormRequest,
    @JsonProperty("account")
    val accountFormRequest: AccountFormRequest,
    @JsonProperty("credential_user")
    val credentialUserFormRequest: CredentialUserFormRequest,
    @JsonProperty("address")
    var address: AddressFormRequest,
    @JsonProperty("card")
    var card: CardFormRequest
) {

    fun toCustomerData() = CustomerData(
        customer = customerFormRequest.toCustomerEntity(),
        account = accountFormRequest.toAccountEntity(),
        credentialUser = credentialUserFormRequest.toCredentialUserEntity(),
        card = this.card.toEntity(),
        address = this.address.toEntity()
    )

}
