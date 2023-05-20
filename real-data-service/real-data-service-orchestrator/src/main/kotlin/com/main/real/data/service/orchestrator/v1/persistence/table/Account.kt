package com.main.real.data.service.orchestrator.v1.persistence.table

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "account")
data class Account(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    val idInternal: Long? = null,
    @Column(name = "id_external")
    val idExternal: UUID? = UUID.randomUUID(),
    @Column(name="number")
    val number:Long,
    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    val accountStatusEnum: AccountStatusEnum,
    @OneToMany(mappedBy ="account")
    val datas: List<CustomerData>?=null
)