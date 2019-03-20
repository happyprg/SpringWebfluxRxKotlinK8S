package com.happyprg.spring.webflux.handler.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "admin")
data class AdminConfiguration(var host: String? = null)
