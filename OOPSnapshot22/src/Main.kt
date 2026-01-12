class Team<T : Player>(val name: String, private val players: MutableList<out T>) {
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the team ${this.name}.")
        } else {
//            players.add(player)
            println("Player: ${player.name} was added to the team ${this.name}.")
        }
    }
}

open class Player(val name: String)

class FootballPlayer(name: String) : Player(name)

class BaseballPlayer(name: String) : Player(name)

open class GamesPlayer(name: String) : Player(name)

class CounterStrikePlayer(name: String) : GamesPlayer(name)

fun main() {
//  inline and reified for runtime type checking.
    val mixedList = mutableListOf(
        1, 2, 360, 'a', 'b', 'c', "hello", "world"
    )

    val specificList = getSpecificTypes<Char>(mixedList)

    for (element in specificList) {
        println(element)
    }
}

inline fun<reified T> getSpecificTypes(list: List<Any>): List<T> {
    val specificList = mutableListOf<T>()

    for (element in list) {
        if (element is T) {
            specificList.add(element)
        }
    }

    return specificList
}