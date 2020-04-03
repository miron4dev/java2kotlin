package com.miron4dev

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class User(val username: String, val email: String, val deletedAt: LocalDateTime?)

// https://kotlinlang.org/docs/reference/data-classes.html
fun main() {
    val user = User("miron", "evgenym@cybcube.com", null)

    println(user)

    println(user.copy(username = "newUsername"))

    val user2 = User(username = "test", email = "test@example.com", deletedAt = LocalDateTime.now().minusMonths(3))

    printUserDetails(user2)

    val (username, email) = user2

    println("Username=$username, email=$email")
}

private fun printUserDetails(user: User) {
    println("Username ${user.username} deleted at ${user.deletedAt?.format(DateTimeFormatter.ISO_DATE)}")
}