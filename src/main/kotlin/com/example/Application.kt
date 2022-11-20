package com.example

import io.ktor.server.application.*
import com.example.plugins.*
import io.ktor.serialization.jackson.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.contentnegotiation.*

fun main(){
    embeddedServer(Netty, port = 8081, host = "192.168.1.7") {
//        DatabaseFactory.init()
//        configureSerialization()
//        configureSockets()
//        configureRouting()
        configureSerialization()
        configureRouting()
        install(ContentNegotiation){
            jackson()
        }


    }.start(wait = true)
}



//@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
//fun Application.module() {
//    configureSerialization()
//    configureRouting()
//}
