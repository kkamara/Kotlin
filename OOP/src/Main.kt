fun main() {
    val user1 = User(
        "Kel",
        "Kamara",
        29
    )
    val user2 = User(
        "Kel",
        "Kamara",
        29
    )

    println(user1 == user2)

    println(user1)
    println(user2)
}

data class User(
    var firstName: String,
    var lastName: String,
    var age: Int
)

