fun main() {
    val car = Car("BMW", "RED", 1, 4)
    val plane = Plane("Boeing", "WHITE and BLUE", 4, 4)

    car.move()
    car.stop()

    plane.move()
    plane.stop()
}

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