package com.example.demo

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @Value("\${hello.name}")
    lateinit var name: String

    @GetMapping("/hello")
    fun hello() = Greeting("Hello, $name")

}

data class Greeting(val content: String)