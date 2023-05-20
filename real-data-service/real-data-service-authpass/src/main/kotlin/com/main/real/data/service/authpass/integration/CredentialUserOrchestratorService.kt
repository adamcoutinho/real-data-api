package com.main.real.data.service.authpass.integration

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import java.util.UUID

@FeignClient(name="orchestrator-credentialuser", url="http://localhost:8082/orchestrator/login")
interface CredentialUserOrchestratorService {

    @PostMapping(produces = [MediaType.APPLICATION_JSON_VALUE], consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun request(@RequestBody request: CredentialUserFormRequest): String
}