fun main() {
    val numbers = listOf(
        "one", "two", "three", "four", "five"
    )
    println(numbers.elementAt(3))
    println(numbers.first())
    println(numbers.last())
    println("\n")
    println(numbers.first { 3 < it.length })
    println(numbers.last { it.startsWith("f") })
    println(numbers.random())
    println(numbers.isEmpty())
}
