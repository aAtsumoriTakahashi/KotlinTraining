package io.access.kotlintraining

import org.junit.Test
import kotlin.test.assertEquals

class SampleTest {

    fun hello(){
        println("Hello World!")
    }

    @Test
    fun testWelcome() {
        welcome()
        hello()

        // Example of test
        val expected = 1
        val actual = 1
        assertEquals(expected, actual, "[want] $expected [got] $actual")
    }

    @Test
    fun testHello() {
        // TODO: implement to call hello function
    }
}