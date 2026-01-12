package com.kelvinkamara

import kotlinx.coroutines.*

val handler = CoroutineExceptionHandler { _, exception ->
    println("Error in one of the children: ${exception.message}")
}

fun main() { // Executed on the main thread.
    println("Main program starts: ${Thread.currentThread().name}")

    val startTime = System.currentTimeMillis()
    // Parent coroutine.
    val parentJob = CoroutineScope(Dispatchers.Default).launch {
//        Lazy: Only invoked when the result is going to be used.
        val job1 = async(start = CoroutineStart.LAZY) {
            getData1(Thread.currentThread().name)
        }
        val job2 = async(start = CoroutineStart.LAZY) {
            getData2(Thread.currentThread().name)
        }
        val job3 = async(start = CoroutineStart.LAZY) {
            getData3(Thread.currentThread().name)
        }
        println(job1.await() + "\n${job2.await()}" + "\n${job3.await()}")
    }
    runBlocking { parentJob.join() }
    parentJob.invokeOnCompletion {
        it?.let {
            println("Parent job FAILED: ${it.message}")
        } ?: println("Parent job SUCCESS!")
    }
    println("Total time: ${System.currentTimeMillis() - startTime}ms")

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

private suspend fun getData3(threadName: String): String {
    println("Fake work3 starts: $threadName")
    delay(2000)
    println("Fake work3 finished: $threadName")
    return "Result 3"
}