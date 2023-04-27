package top.abr.demo_spring_kt_mvn

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class DemoSpringKtMvnApplication {
    @GetMapping("/")
    fun hello(): String {
        return "Hello, world!"
    }
}

fun main(args: Array<String>) {
    runApplication<DemoSpringKtMvnApplication>(*args)
}
