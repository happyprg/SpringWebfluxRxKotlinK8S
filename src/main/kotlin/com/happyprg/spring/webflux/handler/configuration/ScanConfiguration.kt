package com.happyprg.spring.webflux.handler.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "scan")
data class ScanConfiguration(var host: String? = null)
