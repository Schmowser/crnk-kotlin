package com.schmowser.crnkkotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrnkKotlinApplication

fun main(args: Array<String>) {
	runApplication<CrnkKotlinApplication>(*args)
}
