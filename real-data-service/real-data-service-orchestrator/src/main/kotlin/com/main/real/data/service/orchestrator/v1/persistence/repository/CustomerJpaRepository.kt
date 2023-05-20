package com.main.real.data.service.orchestrator.v1.persistence.repository

import com.main.real.data.service.orchestrator.v1.persistence.table.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerJpaRepository: JpaRepository<Customer, Long>