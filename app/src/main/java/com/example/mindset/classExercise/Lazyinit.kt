package com.example.mindset.classExercise

class Lazyinit {

    var k1: String
    var k2: Int

    constructor(a1: String, a2: Int) {
        this.k1 = a1
        this.k2 = a2
    }


    private val name_01: String by lazy {
        println("name_ 01 은 아직 값이 없다")
        "moonkihoon"
    }

    fun lazyinit() {
        println(name_01)
    }

    fun constructorPrintln() {
        println("생성자 a1 = $k1 , 생성자 a2 = $k2 세")
    }

    fun template() {
        lazyinit()
        constructorPrintln()
    }



}

fun main(args: Array<String>) {
    val lazyinit_instance = Lazyinit("문기훈", 29)
    lazyinit_instance.template()
//    val lazyinit_instance02 = Lazyinit()
}