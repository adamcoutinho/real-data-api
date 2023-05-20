package com.main.real.data.service.producer.stream.v1.endpoint

import com.main.real.data.service.producer.stream.v1.dispacher.DispacherMessage
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/stream")
class ProducerEndpoint(private val dispacherMessage: DispacherMessage) {

    @PostMapping
    fun post(@RequestBody request:String) {
        this.dispacherMessage.send(request)
    }
}