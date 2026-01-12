class Team<T : Player>(val name: String, private val players: MutableList<in T>) {
    fun addPlayer(player: T) {
        if (players.contains(player)) {
            println("Player: ${player.name} is already in the team ${this.name}.")
        } else {
            players.add(player)
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
//  Covariance: set line 1 `in` to `out`.
//    val footballTeam = Team<Player>(
//        "Football Team",
//        mutableListOf<FootballPlayer>(FootballPlayer("Player 1"), FootballPlayer("Player 2"))
//    )
//  Contravariance
    val gamesTeam = Team<CounterStrikePlayer>(
        "Games Team",
        mutableListOf<GamesPlayer>(GamesPlayer("Player 1"), GamesPlayer("Player 2"))
    )
}