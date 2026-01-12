package com.kelvinkamara

import kotlinx.coroutines.*
// KotlinCoroutinesSnapshot5Point1.
val handler = CoroutineExceptionHandler { _, exception ->
    println("Error in one of the children: ${exception.message}")
}

fun main() { // Executed on the main thread.
    println("Main program starts: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()
    // Parent coroutine.
    val parentJob = CoroutineScope(Dispatchers.Default).launch(handler) {
        supervisorScope { // KotlinCoroutinesSnapshot5Point1.
            val job1 = launch {
                println(getData1(Thread.currentThread().name))
            }
            val job2 = launch {
                println(getData2(Thread.currentThread().name))
            }
            val job3 = launch {
                println(getData3(Thread.currentThread().name))
            }
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
    throw Exception("Error while getting the data in getData1()")
    delay(2000)
    println("Fake work1 finished: $threadName")
    return "Result 1"
}

private suspend fun getData2(threadName: String): String {
    println("Fake work2 starts: $threadName")
    throw Exception("Error while getting the data in getData2()")
    delay(2000)
    println("Fake work2 finished: $threadName")
    return "Result 2"
}

private suspend fun getData3(threadName: String): String {
    println("Fake work3 starts: $threadName")
    delay(2000)
    println("Fake work3 finished: $threadName")
    return "Result 3"
}