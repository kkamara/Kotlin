fun main() {
//    val numbers = mutableListOf(
//        2, 5, 1, 40, 20, 100, 60
//    )
//    val sorted = numbers.sorted()
//    println(sorted)
    val laptops = mutableListOf(
        Laptop("Dell", 2021, 4, 600),
        Laptop("Acer", 2020, 16, 800),
        Laptop("Apple", 2022, 8, 1000)
    )
//    print("\n")
//    laptops.sorted().forEach {
//        println(it)
//    }
//    print("\n")
//    laptops.sortedWith(ComparatorRam()).forEach { println(it) }
//    print("\n")
//    laptops.sortedWith(ComparatorYear()).forEach { println(it) }

//    laptops.sortedWith(compareBy { it.price }).forEach { println(it) }
//    print("\n")
//    laptops.sortedWith(compareBy { it.ram }).forEach { println(it) }
//    print("\n")
//    laptops.sortedWith(compareBy { it.year }).forEach { println(it) }

    laptops.sortedBy { it.price }.forEach { println(it) }
    print("\n")
    laptops.sortedBy { it.ram }.forEach { println(it) }
    print("\n")
    laptops.sortedWith(compareBy<Laptop> { it.year }.thenBy { it.price }).forEach { println(it) }
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)/*: Comparable<Laptop>*/ {
//    override fun compareTo(other: Laptop): Int {
//        return if (this.price > other.price) {
//            println("In if stmt: Swapping ${this.brand} with ${other.brand}")
//            1
//        } else if (this.price < other.price) {
//            println("In if stmt: Swapping ${this.brand} with ${other.brand}")
//            -1
//        } else {
//            0
//        }
//    }
}

//class ComparatorRam: Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.ram > laptop2.ram) {
//            1
//        } else if (laptop1.ram < laptop2.ram) {
//            -1
//        } else {
//            0
//        }
//    }
//}
//
//class ComparatorYear: Comparator<Laptop> {
//    override fun compare(laptop1: Laptop, laptop2: Laptop): Int {
//        return if (laptop1.year > laptop2.year) {
//            1
//        } else if (laptop1.year < laptop2.year) {
//            -1
//        } else {
//            0
//        }
//    }
//
//}