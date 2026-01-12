package com.kelvinkamara

import kotlinx.coroutines.*

fun main() { // Executed on the main thread.
    println("Main program starts: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()
    // Parent coroutine.
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        // The following returns null if the timeout is exceeded.
        val job1 = withTimeoutOrNull(1000) { // KotlinCoroutinesSnapshot5Point1.
            println(getData1(Thread.currentThread().name))
        }
        println(job1)
        val job2 = launch {
            println(getData2(Thread.currentThread().name))
        }
    }
    runBlocking { parentJob.join() }
    parentJob.invokeOnCompletion {
        it?.let {
            println("Parent job FAILED: ${it.message}")
        } ?: println("Parent job SUCCESS!")
    }
    println("Total time: ${System.currentTimeMillis() - start}ms")

    println("Main program ends: ${Thread.currentThread().name}")
}

private suspend fun getData1(threadName: String): String {
    println("Fake work1 starts: $threadName")
    delay(2000)
    println("Fake work1 finished: $threadName")
    return "Result 1"
}

private suspend fun getData2(threadName: String): String {
    println("Fake work2 starts: $threadName")
    delay(2000)
    println("Fake work2 finished: $threadName")
    return "Result 2"
}