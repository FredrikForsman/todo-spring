package se.fredf.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.openfeign.EnableFeignClients


@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}