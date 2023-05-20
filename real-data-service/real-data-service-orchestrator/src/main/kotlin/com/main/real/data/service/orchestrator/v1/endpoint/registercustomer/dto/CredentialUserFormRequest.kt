package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto

import com.fasterxml.jackson.annotation.JsonProperty
import com.main.real.data.service.orchestrator.v1.persistence.table.CredentialUser

data class CredentialUserFormRequest(
    @JsonProperty("user_name")
    var userName: String,
    var email: String,
    var password: String,
) {

    fun toCredentialUserEntity() = CredentialUser(
        userName = this.userName,
        email = this.email,
        password = this.password
    )

}