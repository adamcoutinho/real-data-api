package com.main.real.data.service.orchestrator.v1.endpoint.authpass.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class AuthFormRequest(
    @JsonProperty("login")
    val login:String?=null,
    @JsonProperty("password")
    val password:String?=null
)