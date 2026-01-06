fun main() {
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

    while (number <= lastNumber) {
        number++

        if ((number % 2) != 0) {
            continue
        }

        evenNumberCounter++
        println(number)
    }

    println("Now we are looping using the FOR loop")
    evenNumberCounter = 0
    for (i in 1..20) {
        if ((i % 2) != 0) {
            continue
        }

        evenNumberCounter++
        println(i)
    }
    println("Total number of even numbers found = $evenNumberCounter")
    println("Total number of even numbers found - using for loop - are: $evenNumberCounter")
}
