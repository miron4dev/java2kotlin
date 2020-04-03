package com.miron4dev

// https://kotlinlang.org/docs/reference/collections-overview.html
fun main() {
    val immutableList = listOf(1, 2, 3)

    println(immutableList[0])

//    immutableList.add(4)

    val mutableList = mutableListOf(10, 11, 12)
    mutableList.add(13)

    val immutableMap = mapOf(
        1 to "one",
        2 to "two",
        3 to "three"
    )
    println(immutableMap[1])

//    immutableMap.put(4, "four")

    val mutableMap = mutableMapOf(
        10 to "ten"
    )

    mutableMap[11] = "eleven"

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numbers)

    println(numbers.filter { it % 2 == 0 })

    println(numbers.map { it + 1 })

    println(numbers.chunked(2) { it.sum() })

}