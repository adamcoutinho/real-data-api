package com.main.real.data.service.authpass.v1.service

import com.main.real.data.service.authpass.integration.CredentialUserFormRequest
import com.main.real.data.service.authpass.integration.CredentialUserOrchestratorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ServiceLogin(
    private val credentialUserOrchestratorService: CredentialUserOrchestratorService
) {

    fun authentic(userNameOrEmail:String, password:String):String {
        return this.credentialUserOrchestratorService.request(
            CredentialUserFormRequest(
                login = userNameOrEmail,
                password = password
            )
        )
    }

}