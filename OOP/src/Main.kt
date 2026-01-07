fun main() {
    // Named arguments can only be used with primary constructors.
    val user = User("Kel")
    val friend = User(firstName = "John", lastName = "Smith")
    val user2 = User(age = 19, firstName = "Ioana", lastName = "Dobbi")

    user.firstName = "Vlad"

    println(user.firstName)
    println(user.lastName)
    println(user.age)

    println()

    println(friend.firstName)
    println(friend.lastName)
    println(friend.age)
}

class User(firstName: String, var lastName: String = "LastName", var age: Int = 0) {
//    init {}
//    constructor(firstName: String, lastName: String) : this(firstName, lastName) {}
    var firstName = firstName
    get() = field
    set(value) {
        field = value
    }
}