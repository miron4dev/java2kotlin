package com.miron4dev

// https://kotlinlang.org/docs/reference/null-safety.html
fun main() {
    var str: String = "something"
//    str = null

    var nullableStr: String? = "nullable"

//    nullableStr = null

//    doSmth(str)

//    doSmth(nullableStr)

//    println(nullableStr?.length)

//    println(nullableStr!!.length)

//    var someList: List<String?> = listOf("one", "two", "three", null)

//    println(someList[0].length)
}

private fun doSmth(str: String) {
    println(str)
}