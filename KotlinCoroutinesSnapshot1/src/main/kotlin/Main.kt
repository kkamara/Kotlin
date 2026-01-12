package com.kelvinkamara

import kotlinx.coroutines.*

fun main() { // Executed on the main thread.
    println("Main program starts: ${Thread.currentThread().name}")

    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        println("Fake work starts: ${Thread.currentThread().name}")
        delay(5000) // Pretending to do some work.
        println("Fake work finished: ${Thread.currentThread().name}")
    }
    runBlocking { parentJob.join() }

    println("Main program ends: ${Thread.currentThread().name}")
}