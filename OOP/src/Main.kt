fun main() {

}

abstract class Vehicle() {
    val text = "Some text." // Cannot have properties initialised in interfaces.

    abstract fun move()

    abstract fun stop()
}

class Car(var name: String, var color: String, val engines: Int, val doors: Int): Vehicle() {

    override fun move() {

    }

    override fun stop() {

    }
}

