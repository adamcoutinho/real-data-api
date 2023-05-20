package com.main.real.data.service.orchestrator.v1.persistence.table

import jakarta.persistence.*
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "customer")
data class Customer(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    val idInternal: Long? = null,
    @Column(name = "id_external")
    val idExternal: UUID? = UUID.randomUUID(),
    @Column(name="full_name")
    val fullname:String,
    @Column(name="first_name")
    val firstName:String,
    @Column(name="last_name")
    val lastName:String,
    @Column(name="birthday")
    val birthDate:LocalDate?=null,
    @Column(name="created")
    val created:LocalDateTime?= LocalDateTime.now(),
    @OneToMany(mappedBy ="customer")
    val datas: List<CustomerData>?=null
)