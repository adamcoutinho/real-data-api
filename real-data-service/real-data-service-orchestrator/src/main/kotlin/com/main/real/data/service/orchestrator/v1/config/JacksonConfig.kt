package com.main.real.data.service.orchestrator.v1.config

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import java.time.format.DateTimeFormatter
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder


@Configuration
class JacksonConfig {
    @Bean
    fun jackson2ObjectMapperBuilderCustomizer(): Jackson2ObjectMapperBuilderCustomizer {
        return Jackson2ObjectMapperBuilderCustomizer { builder: Jackson2ObjectMapperBuilder ->

            // formatter
            val dateFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd")
            val dateTimeFormatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")

            // deserializers
            builder.deserializers(LocalDateDeserializer(dateFormatter))
            builder.deserializers(
                LocalDateTimeDeserializer(
                    dateTimeFormatter
                )
            )

            // serializers
            builder.serializers(LocalDateSerializer(dateFormatter))
            builder.serializers(LocalDateTimeSerializer(dateTimeFormatter))
        }
    }
}