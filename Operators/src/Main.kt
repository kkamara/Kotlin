fun main() {
    var x = 5
    val y = 3.0

//    val result = x + y
//    println("result = $result")

//    All expressions in curly braces are type double.
//    If y = 3.0f the precision gets lowered.
    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println("3 + 3 * 4 = ${(3 + 3) * 4}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    x = 0

    println("x++ = ${x++}")
    println("++x = ${++x}")
    println("x = $x")

    println("x-- = ${x--}")
    println("--x = ${--x}")
    println("x = $x")

    var isActive = false
    if (true == isActive) { // Personal note: this is Yoda Notation - a standard I follow.
        println("The condition is true.")
    } else {
        println("The condition is false.")
    }
//    if (isActive)

    var myNumber = 5
    if (4 < myNumber)
        println("The number is greater than 4.")
    else
        println("The condition is false.")

    myNumber = 4
    if (5 < myNumber) {
        println("The number is greater than 5.")
    } else if (4 <= myNumber) {
        println("The number is greater than 4.")
    } else {
        println("The condition is false.")
    }

    myNumber = 150
    if (150 > myNumber) {
        println("Less than 150.")
    } else if (150 >= myNumber) {
        println("Less than 150 or equal to 150.")
    } else {
        println("The condition failed.")
    }

    if (150 != myNumber) {
        println("Not equal to 150.")
    }

    myNumber = 100
    if (150 != myNumber) {
        println("Not equal to 150.")
    }

    isActive = false
    if (!isActive) {
        println("The user is not active.")
    } else {
        println("The user is active.")
    }

    isActive = true
    val score = 100
    val internetSpeed = 5000

    if (isActive && 100 == score && 5000 == internetSpeed) {
        println("You are at the next level.")
    } else {
        println("You are at the same level.")
    }

    var num1 = 5
    val num2 = -3
    if (0 < num1 || 0 < num2) {
        println("The condition is true.")
    } else {
        println("The condition is false.")
    }

//    Personal scope test
    if (true) {
        val myScopeTest = true
    }
//    println("myScopeTest = $myScopeTest") // Can't do it.

    var text = if (0 < num1 || 0 < num2) {
        println("The condition is true")
        "This is text 1"
    } else {
        println("The condition is false")
        "This is text 2"
    }
    println("text = $text")

    num1 = -5
    val text2 = if (0 < num1 || 0 < num2) "This is text 1" else 5
    println("text2 = $text2")

    num1 = -5
    if (0 < num1 || 0 < num2)
        println("The condition is true.")
        println("This condition is true and some text.") // This still gets executed.
//    Use curly braces.
//    Only omit curly braces if you have 1 single expression.

    if (0 < num1 || 0 < num2) println("The condition is true.") else println("This condition is false")
}