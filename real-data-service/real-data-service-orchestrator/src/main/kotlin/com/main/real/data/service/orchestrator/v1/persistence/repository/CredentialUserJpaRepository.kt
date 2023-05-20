package com.main.real.data.service.orchestrator.v1.persistence.repository

import com.main.real.data.service.orchestrator.v1.persistence.table.CredentialUser
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface CredentialUserJpaRepository: JpaRepository<CredentialUser,Long> {

    fun findCredentialUserByUserNameAndPassword(userName:String,password:String):CredentialUser?

}