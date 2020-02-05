package se.fredf.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}