package com.kelvinkamara

import kotlinx.coroutines.*

fun main() { // Executed on the main thread.
    println("Main program starts: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()
    // Parent coroutine.
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val job1 = launch { // Child coroutine.
            val result1 = getData1(Thread.currentThread().name)
            println(result1)
        }
//        job1.join() // Run in sequence, not in parallel.
        val job2 = launch {
            val result2 = getData2(Thread.currentThread().name)
            println(result2)
        }
    }
    runBlocking { parentJob.join() }
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