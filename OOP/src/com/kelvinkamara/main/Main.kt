package com.kelvinkamara.main

import com.kelvinkamara.classes.*

fun main() {
    val footballTeam = Team<FootballPlayer>(
        "Football Team",
        mutableListOf(
            FootballPlayer("Player 1"),
            FootballPlayer("Player 2")
        )
    )
}