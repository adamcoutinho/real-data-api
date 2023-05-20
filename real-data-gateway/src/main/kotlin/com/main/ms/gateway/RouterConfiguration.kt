package com.main.ms.gateway

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.GatewayFilterSpec
import org.springframework.cloud.gateway.route.builder.PredicateSpec
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.cloud.gateway.route.builder.filters
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RouterConfiguration {

    @Bean
    fun gatewayRouter(builder: RouteLocatorBuilder): RouteLocator? {
        return builder.routes()

            .route { p: PredicateSpec ->
                p.path("/orchestrator/**")
                    .uri("lb://backend-service-orchestrator")
            }

            .route { p: PredicateSpec ->
                p.path("/live/**")
                    .uri("lb://backend-service-authpass")
            }

            .route { p: PredicateSpec ->
                p.path("/customer/**")
                    .uri("lb://backend-service-customer")
            }
            .route { p: PredicateSpec ->
                p.path("/card/**")
                    .uri("lb://backend-service-card")
            }

            .route { p: PredicateSpec ->
                p.path("/account/**")
                    .uri("lb://backend-service-account")
            }

            .build()
    }
}