fun main() {
    sayHello("Kel", 29)

    val hasInternetConnection = true
    if (hasInternetConnection) {
        getData("Some data.")
    } else {
        showMessage()
    }
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