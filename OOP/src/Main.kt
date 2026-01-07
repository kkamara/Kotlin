fun main() {
    val car1 = Car(" Tesla   ", "S Plaid", "Red", 4)
//    car1.name = "Tesla"
//    car1.model = "S Plaid"
//    car1.color = "Red"
//    car1.doors = 4
/*
    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")

    car1.move()
    car1.stop()

    val car2 = Car("Ford", "Mustang", "Blue", 2)

    println()
    println("Name = ${car2.name}")
    println("Model = ${car2.model}")
    println("Color = ${car2.color}")
    println("Doors = ${car2.doors}")

    car2.move()
    car2.stop()
 */
    val user = User("Kel", "Kamara", 29)
//    val friend = User("John", "Smith", 30)
//    val friend = User("Kev", "Smith", 30)
    val friend = User("John", "Smith", 30)

    println("Name ${friend.name}")
}

class User(name: String, var lastName: String, var age: Int) {
    var name: String

    init {
        if (name.lowercase().startsWith('k')) {
            this.name = name
        } else {
            this.name = "User"
            println("The name doesn't start with the letter 'k' or 'K'.")
        }
    }

    init { // The order of which initialiser blocks are declared matters.

    }
}