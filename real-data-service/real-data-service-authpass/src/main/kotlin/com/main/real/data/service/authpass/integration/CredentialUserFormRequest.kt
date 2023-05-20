package com.main.real.data.service.authpass.integration

import com.fasterxml.jackson.annotation.JsonProperty

data class CredentialUserFormRequest(
    @JsonProperty("login")
    var login:String,
    @JsonProperty("password")
    var password:String
)