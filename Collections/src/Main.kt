fun main() {
    val users = mutableMapOf<Int, String>(
        1 to "Maria",
        2 to "Kel",
        3 to "John"
    )
    users[5] = "Vlad"
    users.remove(2)
    users.forEach { t, u ->
        println("$t and $u")
    }
}
