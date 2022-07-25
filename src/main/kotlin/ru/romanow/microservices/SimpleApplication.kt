package ru.romanow.microservices

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SimpleApplication

fun main(args: Array<String>) {
    SpringApplication.run(SimpleApplication::class.java, *args)
}

@RestController
@RequestMapping("/")
class SimpleController(
    @Value("\${greeting.message}") private val greeting: String
) {

    @GetMapping
    fun greeting(): ResponseEntity<String> {
        return ok("Hello, $greeting")
    }
}