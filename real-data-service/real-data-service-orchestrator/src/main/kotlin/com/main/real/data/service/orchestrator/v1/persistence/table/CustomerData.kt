package com.main.real.data.service.orchestrator.v1.persistence.table

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "data")
data class CustomerData(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    val idInternal: Long? = null,
    @Column(name = "id_external")
    val idExternal: UUID? = UUID.randomUUID(),
    @ManyToOne
    val customer: Customer,
    @ManyToOne
    val credentialUser: CredentialUser,
    @ManyToOne
    val account: Account,
    @ManyToOne
    val address:Address,
    @ManyToOne
    val card: Card
)