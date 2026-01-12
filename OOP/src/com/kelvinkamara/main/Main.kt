package com.kelvinkamara.main

import com.kelvinkamara.classes.*

fun main() {
    val footballTeam = Team<Player>(
        "Football Team",
        mutableListOf(
            FootballPlayer("Player 1"), FootballPlayer("Player 2")
        )
    )
    val gamesTeam = Team<GamesPlayer>(
        "Games Team",
        mutableListOf(
            GamesPlayer("Player 1"), GamesPlayer("Player 2")
        )
    )
}
