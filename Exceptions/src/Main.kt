fun main() {
    var a = 5
    var b = 0

    var result = try {
        println(a / b)
        a/b
    } catch (e: ArithmeticException) {
        println(e.message)
        0
    } finally {
        println("Divide by zero.")
    }

    println(result)
}