fun main() {
    val direction = Direction.valueOf("east".uppercase())

    when(direction) {
        Direction.EAST -> {
            println("The direction is EAST")
        }
        Direction.WEST -> println("The direction is WEST")
        Direction.NORTH -> println("The direction is NORTH")
        Direction.SOUTH -> println("The direction is SOUTH")
    }
}

enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction = $direction and distance = $distance")
    }
}