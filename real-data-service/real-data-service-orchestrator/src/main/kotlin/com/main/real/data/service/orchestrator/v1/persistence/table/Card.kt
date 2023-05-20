package com.main.real.data.service.orchestrator.v1.persistence.table

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity
@Table(name = "card")
data class Card(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_internal")
    val idInternal: Long? = null,
    @Column(name = "id_external")
    val idExternal: UUID? = UUID.randomUUID(),
    @Column(name="number")
    val number:String,
    @Column(name="dac")
    val dac:String,
    @Enumerated(value = EnumType.STRING)
    @Column(name="status")
    val status:CardStatusEnum,
    @Column(name="canceled")
    val canceled: LocalDateTime?=null,
    @Column(name="created")
    val created: LocalDateTime?= LocalDateTime.now(),
    @OneToMany(mappedBy ="card")
    val datas: List<CustomerData>?=null
)