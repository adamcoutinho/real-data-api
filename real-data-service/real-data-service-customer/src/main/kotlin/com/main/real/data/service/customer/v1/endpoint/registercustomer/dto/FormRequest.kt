package com.main.real.data.service.customer.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.customer.integration.registercustomer.dto.FormRequest

data class FormRequest(
    @JsonProperty("customer")
    val customerFormRequest: CustomerFormRequest,
    @JsonProperty("account")
    val accountFormRequest: AccountFormRequest,
    @JsonProperty("credential_user")
    val credentialUserFormRequest: CredentialUserFormRequest,
    @JsonProperty("address")
    var addressFormRequest: AddressFormRequest,
    @JsonProperty("card")
    var cardFormRequest: CardFormRequest
) {

    fun toRequest() = FormRequest(
        customerRequest = this.customerFormRequest.toCustomerRequest(),
        addressRequest = this.addressFormRequest.toAddressRequest(),
        credentialUserRequest = this.credentialUserFormRequest.toCredentialUserRequest(),
        cardRequest = this.cardFormRequest.toCardRequest(),
        accountRequest = this.accountFormRequest.toAccountRequest()
    )
}