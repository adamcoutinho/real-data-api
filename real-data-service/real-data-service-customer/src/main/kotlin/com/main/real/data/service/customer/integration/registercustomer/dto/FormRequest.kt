package com.main.real.data.service.customer.integration.registercustomer.dto


import com.fasterxml.jackson.annotation.JsonProperty

data class FormRequest(
    @JsonProperty("customer")
    val customerRequest: CustomerRequest,
    @JsonProperty("account")
    val accountRequest: AccountRequest,
    @JsonProperty("credential_user")
    val credentialUserRequest: CredentialUserRequest,
    @JsonProperty("address")
    var addressRequest: AddressRequest,
    @JsonProperty("card")
    var cardRequest: CardRequest
)