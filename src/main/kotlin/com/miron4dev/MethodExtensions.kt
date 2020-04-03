package com.miron4dev

fun main() {
    val list = mutableListOf(1, 2, 3, 4)

    println(list)

    list.swap(0, 1)

    println(list)

    println(3.odd())
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun Int.odd(): Boolean {
    return this % 2 != 0;
}