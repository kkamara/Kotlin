fun main() {
    /*
    Create an arbitrary range of numbers.
    Go through the numbers.
    Skip odd numbers.
    Output even numbers in console.
    Count even numbers found and display the count at the end.
     */
    val range = 1..100
    var evenNumbersCount: Byte = 0
    for (i in range) {
        if (0 == i % 2) {
            evenNumbersCount++
            println("Even number found: $i")
        }
    }
    println("Found $evenNumbersCount even numbers.")
}