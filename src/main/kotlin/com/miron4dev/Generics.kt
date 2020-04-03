package com.miron4dev

// https://kotlinlang.org/docs/reference/inline-functions.html#reified-type-parameters
fun main() {
    determineType("string")
    determineType(123)
}

inline fun <reified T> determineType(value: T) {
    println("Value of ${T::class.java.simpleName} is $value")
}