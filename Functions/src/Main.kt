fun main() {
    sayHello("Kel", 29)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data.")
    } else {
        showMessage()
    }

    val max = getMax(
        a = 5, b = 3,
    )
    println(max)
    println(getMax2(5, 3)) // Returns kotlin.Unit .
    println(getMax3(5, 3))

//    getMax2(5.0, 3.0) // Doesn't work because given params are type Double when expected is Int.
    println(getMax(5.0, 3.0))
    println(getMax(5, 3, 9))

//    sendMessage("Kel", "Hello")
//    sendMessage("Kel")
    sendMessage()
    sendMessage(message = "Hello", name="Jane Doe")
}

fun sayHello(name: String, age: Int) { // Params are scoped within sayHello().
//    age = 30 // Can't change the value of a parameter. They are vals (constants).
    var number = 50
    number = 70
    number = age
    number = 30
    println("Hello, $name! Your age is $age.")
}

fun getData(data: String) {
    println("Your data is $data")
}

fun showMessage() {
    println("There's no internet connection.")
}

fun getMax(a: Int, b: Int): Int {
    return if (a > b) a else b
    println("Doesn't run this.")
}

fun getMax2(a: Int, b: Int) { return }

fun getMax3(a: Int, b: Int) = if (a > b) "test" else b // The type can be inferred.

fun getMax(a: Double, b: Double) = if (a > b) a else b

fun getMax(a: Int, b : Int, c: Int): Int {
    if (a >= b && a >= c) {
        return a
    } else if (b >= a && b >= c) {
        return b
    } else {
        return c
    }
}

fun sendMessage(name: String = "User", message: String = sendText()) {
    println("Name = $name and message = $message")
}

fun sendText() = "Some text."