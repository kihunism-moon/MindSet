package com.example.mindset.mindset

fun main(args: Array<String>) {

    memory()
    oneWord()
    listPrintln()
    propertiesAndField()

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
    cut()

}

fun cut() {
    println("=============Cut ! ==================")
}

fun oneWord() {
    val name = "abc"
    for(ch in name) {
        println("charAp($ch)")
    }
    cut()
}

fun listPrintln() {
    val list = mutableListOf("a", 0, 1, "8")
    println(list)

    for(ch in list) {
        println(" -->  $ch")
    }
    cut()
}

class Ex {
    private val no: String by lazy {
        println("---lazy init---")
        "lazy init"
    }



}

fun propertiesAndField() {

    var name: String = "Name" // var name = String 과 같음
    var name2 = "MoonKihoon"
    name = "abc chocolate"

    var name3: String? = null
//  여기서 사용된 String? 은 기존의 String과는 다른 자료형이다!!



    cut()
}

class Sample<T> {
    var list: List<T> = mutableListOf()
        set(value) {
            if(value.isNotEmpty()) {
                field = value
            }
        }
        get() = field

    val isEmpty: Boolean
        get() = this.list.isEmpty()
}