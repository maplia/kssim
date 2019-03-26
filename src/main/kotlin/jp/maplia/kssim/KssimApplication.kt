package jp.maplia.kssim

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class KssimApplication: SpringBootServletInitializer()

fun main(args: Array<String>) {
	SpringApplication.run(KssimApplication::class.java, *args)
}
