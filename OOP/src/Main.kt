fun main() {
    // Using secondary constructor.
    val user = User("Kel")
    val friend = User("John", "Smith")

    println("Name = ${user.name}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println()

    println("Name = ${friend.name}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")
}

class User(var name: String, var lastName: String, var age: Int) {
    // Secondary constructors cannot declare properties, only params.
    constructor(name: String): this(name, "LastName", 0) {
        println("2nd")
    }

    constructor(name: String, lastName: String) : this(name, lastName, 0) {
        println("3rd")
    }
}