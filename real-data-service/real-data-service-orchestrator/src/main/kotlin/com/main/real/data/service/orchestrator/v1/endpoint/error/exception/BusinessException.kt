package com.main.real.data.service.orchestrator.v1.endpoint.error.exception

data class BusinessException(
    override val message:String?=null
): RuntimeException()