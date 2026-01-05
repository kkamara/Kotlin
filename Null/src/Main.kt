fun main() {
//    val text: String = null // Can't.
    val text: String? = null
    println(text) // null

    var text2: String? = "Name"
//    println(text2.length) // Can't.
    println(text2!!.length)

    if (null != text2) {
        println(text2.length)
    } else {
        println("The variable is null.")
    }

    text2 = null

    if (null != text2) {
        println(text2.length)
    } else {
        println("The variable is null.")
    }

    println(text?.length)
//    println(text!!.length) // Throws null pointer exception.

    val text3 = text2 ?: "The variable is null."
    println(text3)

    val isNull = null
    val text4 = isNull ?: "The variable is null."
    println(text4)

    var text5 = ""
    // Elvis operator ?: does the following...
    if (null != text5) {
        text5 = text4
    } else {
        text5 = "The variable is null."
    }
    println(text5)
}