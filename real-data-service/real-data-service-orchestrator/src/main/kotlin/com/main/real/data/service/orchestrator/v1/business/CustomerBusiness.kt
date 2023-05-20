package com.main.real.data.service.orchestrator.v1.business

import com.main.real.data.service.orchestrator.v1.persistence.repository.AccountJpaRepository
import com.main.real.data.service.orchestrator.v1.persistence.repository.AddressJpaRepository
import com.main.real.data.service.orchestrator.v1.persistence.repository.CardJpaRepository
import com.main.real.data.service.orchestrator.v1.persistence.repository.CredentialUserJpaRepository
import com.main.real.data.service.orchestrator.v1.persistence.repository.CustomerJpaRepository
import com.main.real.data.service.orchestrator.v1.persistence.repository.DataJpaRepository
import com.main.real.data.service.orchestrator.v1.persistence.table.Account
import com.main.real.data.service.orchestrator.v1.persistence.table.Address
import com.main.real.data.service.orchestrator.v1.persistence.table.Card
import com.main.real.data.service.orchestrator.v1.persistence.table.CredentialUser
import com.main.real.data.service.orchestrator.v1.persistence.table.Customer
import com.main.real.data.service.orchestrator.v1.persistence.table.CustomerData
import org.springframework.stereotype.Service

@Service
data class CustomerBusiness(
    private val customerJpaRepository: CustomerJpaRepository,
    private val accountJpaRepository: AccountJpaRepository,
    private val addressJpaRepository: AddressJpaRepository,
    private val dataJpaRepository: DataJpaRepository,
    private val credentialUserJpaRepository: CredentialUserJpaRepository,
    private val cardJpaRepository: CardJpaRepository
) {

    fun save(
        data:CustomerData
    ):CustomerData {

        val newCustomer = this.customerJpaRepository.save(data.customer)
        val newAccount = this.accountJpaRepository.save(data.account)
        val newCredentialUser= this.credentialUserJpaRepository.save(data.credentialUser)
        val newAddresse= this.addressJpaRepository.save(data.address)
        val newCard = this.cardJpaRepository.save(data.card)

        val newCustomerData = CustomerData(
            customer = newCustomer,
            account = newAccount,
            address = newAddresse,
            credentialUser = newCredentialUser,
            card = newCard
        )

      return  this.dataJpaRepository.save(newCustomerData)

    }

    fun findById(id:Long): CustomerData {

        return this.dataJpaRepository.findCustomerDataByCustomer_IdInternal(id)
    }

}