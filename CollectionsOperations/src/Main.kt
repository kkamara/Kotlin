fun main() {
    val numbers = listOf(
        "one", "two", "three", "four"
    )
    println(numbers.associateWith { it.length })
    println(numbers.associateBy { it.first().uppercase() })
    println(numbers.associateBy(keySelector = {
        it.first().uppercase()
    }, valueTransform = { it.length }))

    val numbersSets = listOf(
        setOf(1, 2, 3),
        setOf(4, 5, 6),
        setOf(7, 8, 9),
    )
    for (numbers in numbersSets) {
        for (number in numbers) {
            println(number)
        }
        print("\n")
    }
    val numbersFlatten = numbersSets.flatten()
    println(numbersFlatten[numbersFlatten.size - 1])
}
