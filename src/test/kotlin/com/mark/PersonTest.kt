package com.mark.kotlin

import com.mark.Human
import org.junit.Test
import org.junit.jupiter.api.Assertions

class PersonTest {
    @org.junit.jupiter.api.Test
    fun bmiTest() {
        val human = Human(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }
    @org.junit.jupiter.api.Test
    fun personBmiTest() {
        val person = Person(66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())
    }
}