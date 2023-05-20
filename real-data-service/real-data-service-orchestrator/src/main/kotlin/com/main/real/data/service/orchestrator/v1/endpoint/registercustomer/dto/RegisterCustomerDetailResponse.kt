package com.main.real.data.service.orchestrator.v1.endpoint.registercustomer.dto

import com.main.real.data.service.orchestrator.v1.persistence.table.CustomerData

data class RegisterCustomerDetailResponse(val firstName:String) {

}

fun CustomerData.toDetailResopnse()= RegisterCustomerDetailResponse(
    firstName = this.customer.firstName
)