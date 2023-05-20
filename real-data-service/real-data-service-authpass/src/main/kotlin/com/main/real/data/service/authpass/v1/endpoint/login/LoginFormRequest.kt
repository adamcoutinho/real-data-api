package com.main.real.data.service.authpass.v1.endpoint.login

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotBlank
const val  MESSAGE_USERNAME="write user or email."
const val  MESSAGE_PASSWORD="write password."
data class LoginFormRequest(
    @JsonProperty("user_name")
    @field:NotBlank(message = MESSAGE_USERNAME)
    var userNameOrEmail:String?=null,
    @JsonProperty("password")
    @field:NotBlank(message = MESSAGE_PASSWORD)
    var password:String?=null
)
