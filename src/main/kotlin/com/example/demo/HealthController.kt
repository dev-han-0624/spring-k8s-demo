package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HealthController {

    @GetMapping("/health")
    fun health(): ResponseEntity<Map<String, Any>> {
        val response = mapOf(
            "status" to "UP",
            "timestamp" to LocalDateTime.now(),
            "service" to "spring-k8s-demo",
            "version" to "1.0.1"
        )
        return ResponseEntity.ok(response)
    }

    @GetMapping("/")
    fun home(): ResponseEntity<Map<String, String>> {
        val response = mapOf(
            "message" to "Welcome to Spring K8s Demo!",
            "health_endpoint" to "/health",
            "actuator_health" to "/actuator/health"
        )
        return ResponseEntity.ok(response)
    }
}