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

/*
open class Vehicle(open val name: String, val color: String) {
    open fun move() {
        println("$name is moving.")
    }

    fun stop() {
        println("$name has stopped.")
    }
}

class Car(override val name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
    override fun move() {
        this.flying()
        super.move()
    }

    fun flying() {
        println("$name is flying.")
    }
}
*/

sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }
    class Success(message: String): Result(message)
    sealed class Error(message: String): Result(message) {
        class RecoverableError(exception: Exception, message: String): Error(message)
        class NonRecoverableError(exception: Exception, message: String): Error(message)
    }
    class Progress(message: String): Result(message)
}