fun main() {
    val numbersStrings = listOf(
        "one", "two", "three", "four", "five", "six"
    )
    println(numbersStrings.slice(1..3))
    println(numbersStrings.slice(0..4 step 2))
    println(numbersStrings.slice(setOf(3, 5, 0)))
    print("\n")
    println(numbersStrings.take(3))
    println(numbersStrings.takeLast(3))
    println(numbersStrings.drop(1))
    println(numbersStrings.dropLast(5))
    print("\n")
    println(numbersStrings.takeWhile{ !it.startsWith("f") })
    println(numbersStrings.takeLastWhile { "three" != it })
    println(numbersStrings.dropWhile { 3 == it.length })
    println(numbersStrings.dropLastWhile { it.contains("i") })
    print("\n")

    val numbers = (0..13).toList()
    println(numbers.chunked(3))
    println(numbers.chunked(3) { it.sum() })
    print("\n")

    val numbersStrings2 = numbersStrings
    println(numbersStrings2.windowed(3))
}
