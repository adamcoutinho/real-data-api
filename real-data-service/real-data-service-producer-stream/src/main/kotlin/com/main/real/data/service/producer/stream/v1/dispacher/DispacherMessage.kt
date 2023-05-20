package com.main.real.data.service.producer.stream.v1.dispacher

import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class DispacherMessage(private val kafkaTemplate: KafkaTemplate<String,Any>) {

    companion object {
        const val TOPIC_MESSAGE="TOPIC_"
    }

    fun send(objectMessage:Any)  {

        this.kafkaTemplate.send(TOPIC_MESSAGE,objectMessage)
    }

}