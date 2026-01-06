fun main() {
    val names = arrayOf("John", "Steven", "Megan")
    val mixedElements = arrayOf(4, 5, 6, 7, 4, "Name 1", 'a')

    names[0] = "Kel"
    println("First element: ${names[0]}")
    println("The size of the array is: ${names.size}")

    for (i in mixedElements) {
//        if (i is Int) {
//            println(i)
//        }
//        if (i is Char) {
//            println(i)
//        }
        if (i is String) {
            println(i)
        }
    }
}