package com.happyprg.spring.webflux.handler.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.router

@Configuration
class ConfigurationRouter(val chainConfiguration: ChainConfiguration, val scanConfiguration: ScanConfiguration, val adminConfiguration: AdminConfiguration) {

    @Bean
    fun configurationRoute() = router {
        (accept(APPLICATION_JSON) and "/configuration").nest {
            GET("/all") {
                ok().body(fromObject("""chainConfiguration - $chainConfiguration
 scanConfiguration - $scanConfiguration
 adminConfiguration - $adminConfiguration"""))
            }
        }
    }
}
