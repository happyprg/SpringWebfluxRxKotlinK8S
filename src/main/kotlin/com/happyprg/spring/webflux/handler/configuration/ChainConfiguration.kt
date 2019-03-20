package com.happyprg.spring.webflux.handler.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "chain")
data class ChainConfiguration(var host: String? = null, var dappChainId: String? = null, var name: String? = null)
