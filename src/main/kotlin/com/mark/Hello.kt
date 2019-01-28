package com.mark

fun main(args: Array<String>) {
//    println("Hello kotlin")
//    Human().hello()
    val h = Human( 66.5f, 1.7f)
    println(h.bmi())
    /*var age = 25
    age = 20
    var weight = 66.5f
    var name : String
    name = "Mark"*/
}

class Human(var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
    fun bmi() :Float {
        val bmi = weight / (height*height)
        return bmi
    }

    fun hello() {
        println("Hello Kotlin")
    }
}