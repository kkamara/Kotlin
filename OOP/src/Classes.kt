//class Car(name: String, var model: String, var color: String, var doors: Int) {
//    var name = name.trim()
//
//    fun move() {
//        println("The car $name is moving.")
//    }
//
//    fun stop() {
//        println("The car $name has stopped.")
//    }
//}

class Calculator {
    companion object {
        fun sum(a: Int, b: Int): Int = a + b
    }
}

object Database {
    init {
        println("Database created.")
    }
}

class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created.")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction = $direction and distance = $distance")
    }
}

class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}