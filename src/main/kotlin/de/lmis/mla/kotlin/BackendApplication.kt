package de.lmis.mla.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BackendApplication

fun main(args: Array<String>) {
    runApplication<BackendApplication>(*args)
}
