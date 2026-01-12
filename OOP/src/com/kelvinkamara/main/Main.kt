package com.kelvinkamara.main

fun main() {
    val user = User()

//    user.firstName = "Kel"
//    user.lastName = "Kamara"
}

open class User {
    protected var firstName: String = ""
    protected var lastName: String = ""
}

class VipUser : User() {
    fun printInfo() {
        println(firstName)
        println(lastName)
    }
}