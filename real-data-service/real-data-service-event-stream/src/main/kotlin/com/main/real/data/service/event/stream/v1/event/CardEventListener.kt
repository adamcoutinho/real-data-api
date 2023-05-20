package com.main.real.data.service.event.stream.v1.event

import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class CardEventListener {

    @KafkaListener
    fun generateCards() {

    }

}