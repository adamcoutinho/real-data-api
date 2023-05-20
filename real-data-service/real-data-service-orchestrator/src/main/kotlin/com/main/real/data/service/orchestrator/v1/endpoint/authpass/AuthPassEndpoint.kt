package com.main.real.data.service.orchestrator.v1.endpoint.authpass

import com.main.real.data.service.orchestrator.v1.endpoint.authpass.dto.AuthDetailResponse
import com.main.real.data.service.orchestrator.v1.endpoint.authpass.dto.AuthFormRequest
import com.main.real.data.service.orchestrator.v1.endpoint.error.exception.BusinessException
import com.main.real.data.service.orchestrator.v1.persistence.repository.CredentialUserJpaRepository
import jakarta.validation.Valid
import org.springframework.http.MediaType
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/login")
class AuthPassEndpoint(private val credentialUserJpaRepository: CredentialUserJpaRepository) {

    @PostMapping(produces = [APPLICATION_JSON_VALUE], consumes = [APPLICATION_JSON_VALUE])
    fun post(@RequestBody @Valid request: AuthFormRequest): ResponseEntity<AuthDetailResponse> {

      val credential= this.credentialUserJpaRepository.findCredentialUserByUserNameAndPassword(
            userName = request.login!!,
            password = request.password!!
        )

        if(credential==null){
            throw BusinessException("is not authentication!")
        }


        return ResponseEntity.ok(AuthDetailResponse(
            credential!!.idExternal.toString()
        ))
    }
}