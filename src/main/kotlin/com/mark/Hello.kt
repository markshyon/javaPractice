package com.mark

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human()
    h.hello()

    var age = 25
    age = age.plus(1)
}

class Human {
    fun hello() {
        println("Hello Kotlin")
    }
}