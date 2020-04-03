package com.miron4dev

// https://kotlinlang.org/docs/reference/typecasts.html
fun main() {
    val something: Any = "test string"

    if (something is String) {
        println(something.length)
    }
}