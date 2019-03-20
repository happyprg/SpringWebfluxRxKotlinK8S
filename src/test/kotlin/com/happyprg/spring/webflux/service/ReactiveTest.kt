package com.happyprg.spring.webflux.service

import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class ReactiveTest {

    @Test
    fun `gugudan`() {
        val dan = 1
        Flux.range(1, 9).flatMap { Mono.just(it * dan).map { println("sampleData = $it") } }.subscribe()
    }

    @Test
    fun `gugudan2`() {
        val dan = 1
        Flux.just(dan).flatMap { gugu -> Flux.range(1, 9).map { it * gugu } }.subscribe(System.out::println)
    }
}
