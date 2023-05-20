package com.main.real.data.service.orchestrator.v1.persistence.repository

import com.main.real.data.service.orchestrator.v1.persistence.table.Card
import org.springframework.data.jpa.repository.JpaRepository

interface CardJpaRepository:JpaRepository<Card,Long>