package com.kelvinkamara.classes

//Car(name: String, var model: String, var color: String, var doors: Int) {
//    var name = name.trim()
//
//    fun move() {
//        println("The car $name is moving.")
//    }
//
//    fun stop() {
//        println("The car $name has stopped.")
//    }
//}

class Calculator {
    companion object {
        fun sum(a: Int, b: Int): Int = a + b
    }
}

object Database {
    init {
        println("Database created.")
    }
}

/*class User(var firstName: String, var lastName: String, var age: Int) {
    init {
        println("User: $firstName was created.")
    }
}*/

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction = $direction and distance = $distance")
    }
}

class ListView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}

/*
open class Vehicle(open val name: String, val color: String) {
    open fun move() {
        println("$name is moving.")
    }

    fun stop() {
        println("$name has stopped.")
    }
}

class Car(override val name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
}

class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
    override fun move() {
        this.flying()
        super.move()
    }

    fun flying() {
        println("$name is flying.")
    }
}
*/

sealed class Result(val message: String) {
    fun showMessage() {
        println("Result: $message")
    }
    class Success(message: String): Result(message)
    sealed class Error(message: String): Result(message) {
        class RecoverableError(exception: Exception, message: String): Error(message)
        class NonRecoverableError(exception: Exception, message: String): Error(message)
    }
    class Progress(message: String): Result(message)
}

abstract class Vehicle() {
    val text = "Some text." // Cannot have properties initialised in interfaces.

    abstract fun move()

    abstract fun stop()
}

/*class Car(var name: String, var color: String, val engines: Int, val doors: Int): Vehicle() {

    override fun move() {

    }

    override fun stop() {

    }
}*/

/*data class User(
    var firstName: String,
    var lastName: String,
    var age: Int
)*/

interface Engine {
    fun startEngine()
}

class Car(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The car is starting the engine.")
    }
}

class Truck(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The truck is starting the engine.")
    }
}

class Plane(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("The plane is starting the engine.")
    }
}

class Tesla(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("Tesla is starting the engine.")
    }
}

class Button(
    val text: String,
    val id: Int,
    onClickListener: OnClickListener
)

class ClickListener(): OnClickListener {
    override fun onClick() {

    }

}

interface OnClickListener {
    fun onClick()
}

class App: A by FirstDelegate(), B by SecondDelegate() {
    override fun print() {
        TODO("Not yet implemented")
    }

    override fun print2() {
        TODO("Not yet implemented")
    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate: A {
    override fun print() {}
}

open class SecondDelegate: B {
    override fun print2() {}
}

private fun getData() {
    println("Getting the data.")
}

internal class Team<T: Player>(val name: String, private val players: MutableList<T>) {
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