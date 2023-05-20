package com.main.real.data.service.orchestrator.v1.persistence.table

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "address")
data class Address(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    val idInternal: Long? = null,
    @Column(name = "id_external")
    val idExternal: UUID? = UUID.randomUUID(),
    @Column(name="city")
    val city:String,
    @Column(name="name")
    val name:String,
    @Column(name="first_name")
    val number:Long,
    @Column(name="neighborhood")
    val neighborhood:String,
    @Column(name="cep")
    val cep: String,
    @Column(name="created")
    val created: LocalDateTime?= LocalDateTime.now(),
    @OneToMany(mappedBy ="address")
    val datas: List<CustomerData>?=null

)