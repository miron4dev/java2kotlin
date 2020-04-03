package com.miron4dev

import java.io.IOException

fun main() {
    ranges()

//    checkedException()

//    doSmthNotImplemented()

//    val someJavaClass = SomeClass()
//    someJavaClass.doSmth()
}

fun ranges() {
    val sum = (1..9).filter { it % 2 == 0 }.map { it + 1 }.sum()

    when (sum) {
        in 1..10 -> println("sum is in the range of [1, 10]")
        in 11..20 -> println("sum is in the range of [10, 20]")
        else -> println("sum is outside the range")
    }
}

fun doSmthNotImplemented() {
    TODO("Implement method")
}

// this one is optional
@Throws(IOException::class)
fun checkedException() {
    throw IOException("something is wrong here")
}