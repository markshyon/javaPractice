package com.mark

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter: LocalDateTime = LocalDateTime.of(2018,12,25,8,0,0)
    val leave = LocalDateTime.of(2018,12,25,10,8,0)
    var car = Car("AAA-0001",enter)
    car.leave = leave
    println(car.duration())
    var hours = Math.ceil((car.duration()/60f).toDouble()).toLong()
    println(hours)
    println(30*hours)
}

class Car(val id:String, val enter: LocalDateTime) {
    var leave: LocalDateTime? = null
        set(value) {
            if (enter.isBefore(value))
                field = value  //field使用特別留意！
        }
    fun duration():Long = Duration.between(enter, leave).toMinutes()

}