package com.mark.student

import java.util.*
import kotlin.math.max

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("Mark", 77, 99)
    stu.print()
    print("High score: ${stu.highest()}" )
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
//        print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + passOrFailed())
//        println("\t" + grading())
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    fun grading() = when(getAverage()) {
            in 90..100 -> 'A'
            in 80..89 -> 'B'
            in 70..79 -> 'C'
            in 60..69 -> 'D'
            else -> 'F'
    }

    fun passOrFailed() = if (getAverage() >= 60) "PASS" else "FAILED"

    fun getAverage() =  (english+math)/2

    fun highest() = if (english > math) english else math
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    val name = scanner.next()
    print("Please enter student's english score: ")
    val english = scanner.nextInt()
    print("Please enter student's math score: ")
    val math = scanner.nextInt()
    val stu = Student(name, english, math)
    stu.print()
}
