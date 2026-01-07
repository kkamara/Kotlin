fun main() {
    val user = User("Kel", "Kamara", 29)

    user.favoriteMovie = "Interstellar"
    println(user.favoriteMovie)
}

class User(var firstName: String, var lastName: String, var age: Int) {
    lateinit var favoriteMovie: String // lateint only on reference types.
}