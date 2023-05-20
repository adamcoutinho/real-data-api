package com.main.real.data.service.orchestrator.v1.persistence.repository

import com.main.real.data.service.orchestrator.v1.persistence.table.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountJpaRepository : JpaRepository<Account, Long> {
}