package com.main.real.data.service.customer.integration.registercustomer.dto


import com.fasterxml.jackson.annotation.JsonProperty


data class CredentialUserRequest(
    @JsonProperty("user_name")
    var userName: String,
    var email: String,
    var password: String,
)