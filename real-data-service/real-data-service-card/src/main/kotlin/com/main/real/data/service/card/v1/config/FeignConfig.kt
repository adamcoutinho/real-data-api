package com.main.real.data.service.card.v1.config

import feign.Response
import feign.codec.ErrorDecoder
import java.lang.Exception

class FeignConfig: ErrorDecoder {
    override fun decode(p0: String?, p1: Response?): Exception {
        TODO("Not yet implemented")
    }
}