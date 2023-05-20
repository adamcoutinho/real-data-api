package com.main.real.data.service.orchestrator.v1.persistence.repository

import com.main.real.data.service.orchestrator.v1.persistence.table.CustomerData
import org.springframework.data.jpa.repository.JpaRepository

interface DataJpaRepository: JpaRepository<CustomerData,Long> {

    fun findCustomerDataByCustomer_IdInternal(id:Long): CustomerData
}