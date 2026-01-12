fun main() {
/*
    If a function can accept a function as a parameter that is called a Higher Order Function.
    If a function can return a function that is also called a Higher Order Function.
    If a function can do both, that is also called a Higher Order Function.
    A lambda is a function with no name.
 */
//    val myLambda = {a: Int -> println(a)}
    add(5, 3, {a: Int -> println(a)})
}

fun add(a: Int, b: Int, action: (Int) -> Unit) {
    action(a + b)
}