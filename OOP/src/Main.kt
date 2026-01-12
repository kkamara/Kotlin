class Team<T>(val name: String, private val players: MutableList<in T>) where T: Player, T: Listener {
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

class FootballPlayer(name: String) : Player(name), Listener {
    override fun listen() {

    }

}

class BaseballPlayer(name: String) : Player(name)

open class GamesPlayer(name: String) : Player(name)

class CounterStrikePlayer(name: String) : GamesPlayer(name)

fun main() {
//  Upper bounds (T requirements at the end of line 1).
//      Team<T: Player> would also be an upper bound.
    val footballTeam = Team<Player>(
        "Football Team",
        mutableListOf<FootballPlayer>(
            FootballPlayer("Player 1"), FootballPlayer("Player 2")
        )
    )
    val gamesTeam = Team<FootballPlayer>(
        "Games Team",
        mutableListOf<GamesPlayer>(
            GamesPlayer("Player 1"), GamesPlayer("Player 2")
        )
    )
}

interface Listener {
    fun listen()
}