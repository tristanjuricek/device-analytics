package com.vmware.carbonblackcloud.deviceanalytics.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class Application {

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, * args)
}