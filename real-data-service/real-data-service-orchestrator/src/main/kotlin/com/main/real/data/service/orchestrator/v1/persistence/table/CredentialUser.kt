package com.main.real.data.service.orchestrator.v1.persistence.table

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "credential_user")
data class CredentialUser(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    val idInternal: Long? = null,
    @Column(name = "id_external")
    val idExternal: UUID? = UUID.randomUUID(),
    @Column(name = "user_name")
    val userName: String,
    @Column(name = "email")
    val email: String,
    @Column(name = "password")
    val password: String,
    @Column(name = "created")
    val created: LocalDateTime? = LocalDateTime.now(),
    @OneToMany(mappedBy ="credentialUser")
    val datas: List<CustomerData>?=null
)