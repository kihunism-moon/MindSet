package com.example.mindset.mindset

fun main(args: Array<String>) {

    memory()
    cut()
    oneWord()
    cut()
    listPrintln()
    cut()

}

/*
Double, Float, Long, Int, Short, Byte, Bit


*/

fun memory() {
    val a: Int = 1000

//  코틀린에서의 메모리 비교 -> " === "
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    println(boxedA === anotherBoxedA)

}

fun cut() {
    println("=============Cut ! ==================")
}

fun oneWord() {
    val name = "abc"
    for(ch in name) {
        println("charAp($ch)")
    }
}

fun listPrintln() {
    val list = mutableListOf("a", 0, 1, "8")
    println(list)

    for(ch in list) {
        println(" -->  $ch")
    }
}