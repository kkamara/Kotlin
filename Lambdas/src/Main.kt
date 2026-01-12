fun main() {
/*
    If a function can accept a function as a parameter that is called a Higher Order Function.
    If a function can return a function that is also called a Higher Order Function.
    If a function can do both, that is also called a Higher Order Function.
    A lambda is a function with no name.
 */
    //    val myLambda = {a: Int -> println(a)}
//    add(5, 3, { a: Int -> println(a) }, 2)
    add(5, 3) { a: Int -> println(a) }

    val loginButton = Button("Login", 34345) {
//      Login user.
        println("test")
    }

    val signUpButton = Button("Sign Up", 2345) {
//      Sign up the user.
    }
}

class Button(val text: String, val id: Int, val onClickListener: () -> Unit) {
    init{
        onClickListener()
    }
}

fun add(a: Int, b: Int, action: (Int) -> Unit, c: Int) {
    action(a + b)
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}