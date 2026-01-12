fun main() {
//  Generics
    val footballPlayer = FootballPlayer("Football Player 1")
    val footballPlayer2 = FootballPlayer("Football Player 2")

    val baseballPlayer = BaseballPlayer("Baseball Player 1")
    val baseballPlayer2 = BaseballPlayer("Baseball Player 2")
//  Implicitly set FootballPlayer type.
    val footballTeam = Team("Football Team", mutableListOf(footballPlayer))
    footballTeam.addPlayer(footballPlayer2)
//    footballTeam.addPlayer(baseballPlayer) // Not the generic type given.

    val baseballTeam = Team("Baseball Team", mutableListOf(baseballPlayer))
    baseballTeam.addPlayer(baseballPlayer2)
//  Explicitly set GamesPlayer type.
    val gamesTeam = Team<GamesPlayer>("Games Team", mutableListOf())
}

class Team<T: Player>(val name: String, val players: MutableList<T>) {
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

class GamesPlayer(name: String) : Player(name)