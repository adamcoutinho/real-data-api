package com.main.real.data.service.orchestrator.v1.persistence.repository

import com.main.real.data.service.orchestrator.v1.persistence.table.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressJpaRepository: JpaRepository<Address, Long>