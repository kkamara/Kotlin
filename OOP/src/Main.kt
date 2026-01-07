fun main() {
    // Named arguments can only be used with primary constructors.
    val user = User("Kel")
    val friend = User(firstName = "John", lastName = "Smith")
    val user2 = User(age = 19, firstName = "Ioana", lastName = "Dobbi")

    println("FirstName = ${user.firstName}")
    println("LastName = ${user.lastName}")
    println("Age = ${user.age}")

    println()

    println("FirstName = ${friend.firstName}")
    println("LastName = ${friend.lastName}")
    println("Age = ${friend.age}")
}

class User(var firstName: String, var lastName: String = "LastName", var age: Int = 0) {
//    init {}
//    constructor(firstName: String, lastName: String) : this(firstName, lastName) {}
}