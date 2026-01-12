package com.kelvinkamara

import kotlinx.coroutines.*

fun main() { // Executed on the main thread.
    println("Main program starts: ${Thread.currentThread().name}")

    val start = System.currentTimeMillis()
    // Parent coroutine.
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
        val job1 = launch { // Child coroutine.
            try {
                println(getData1(Thread.currentThread().name))
            } catch (ex: CancellationException) {
                println("Exception caught safely: ${ex.message}")
            } finally {
                println("Resources closed safely.")
            }
        }
        job1.cancel(CancellationException("My own error message."))
        job1.join()
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