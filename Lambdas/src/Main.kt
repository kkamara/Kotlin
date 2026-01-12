import jdk.internal.util.StaticProperty.userName

fun main() {
/*
    If a function can accept a function as a parameter that is called a Higher Order Function.
    If a function can return a function that is also called a Higher Order Function.
    If a function can do both, that is also called a Higher Order Function.
    A lambda is a function with no name.
 */
//    add(5, 3, { a: Int -> println(a) }, 2)
    add(5, 3) { a: Int -> println(a) }

    val loginButton = Button("Login", 34345) {
//      Login user.
        println("test")
    }

    val signUpButton = Button("Sign Up", 2345) {
//      Sign up the user.
    }

    upperCase("hello") { it.uppercase() }

//    var user = User()
//    val result = with(user) {
//        firstName = "Kel"
//        lastName = "Kamara"
//        age = 29
//        this
//    }
//    println(result)
//
//    user = User().apply {
//        firstName = "Kel"
//        lastName = "Kamara"
//        age = 29
////        29 // The object (this) gets returned, not the returned value.
//    }
//    println(user)
//
//    with(user) {
//        println(firstName)
//        println(lastName)
//        println(age)
//    }

//    User("Kel", "Kamara", 29).also {
//        println(it.firstName)
//    }

//    var text: String? = null
//    text = "Name"
//    val result = text?.let {
//        println(it)
//        "Text"
//    }
//    println(result)

    val user: User? = null

    val result = user?.run {
        println(firstName)
        println(lastName)
        println(age)
        29
    }
    println(result) // null or 29.

//    with(user) {
//        println(firstName)
//        println(lastName)
//        println(age)
//    }
}

class Button(val text: String, val id: Int, val onClickListener: () -> Unit) {
    init {
        onClickListener()
    }
}

fun add(a: Int, b: Int, action: (Int) -> Unit, c: Int) {
    action(a + b)
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}

fun upperCase(str: String, myFunction: (String) -> String) {
    val upperCasedWord = myFunction(str)

    println(upperCasedWord)
}

//class User {
//    var firstName = ""
//    var lastName = ""
//    var age = -1


//class User(val firstName: String, val lastName: String, val age: Int)

data class User(val firstName: String, val lastName: String, val age: Int)