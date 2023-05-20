package com.main.real.data.service.orchestrator.v1.endpoint.authpass.dto

import java.util.UUID

data class AuthDetailResponse(
    val uuid:String?= UUID.randomUUID().toString()
)