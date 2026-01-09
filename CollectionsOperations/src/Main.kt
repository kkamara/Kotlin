fun main() {
    val numbers = listOf(
        "one", "two", "three", "four"
    )
    val longerThan3 = numbers.filter{ 3 < it.length }
    println(longerThan3)

    val numbersMap = mapOf(
        "key 1" to 1,
        "key 2" to 2,
        "key 3" to 3,
        "key 101" to 101,
    )
    val filteredMap = numbersMap.filter{
        it.key.endsWith("1") && 100 < it.value
    }
    println(filteredMap)

    val filteredIndex = numbers.filterIndexed{ index, value ->
        0 != index && 5 > value.length
    }
    val filteredNot = numbers.filterNot { 3 >= it.length }
    println(filteredIndex)
    println(filteredNot)

    val mixedList = listOf(
        1, 2, 3, 'A', 'B', 'C', "Hello World", "Kel", false
    )
    mixedList.filterIsInstance<Boolean>().forEach {
        println(it)
    }
    print("\n")
    // Partition.
    val (match, rest) = numbers.partition{ 3 < it.length }
    println(match)
    println(rest)
}
