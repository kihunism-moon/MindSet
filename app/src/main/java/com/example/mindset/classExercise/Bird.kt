package com.example.mindset.classExercise

open class Bird(name: String, age: Int, color: String, size: String) {

    var birdColor: String

    init {
        println("==== 초기화 블록 시작 ====")
        println("이름은 $name , 나이는 $age")
        this.birdColor = "red"
        println("초기 색은 $birdColor")
        println("==== 초기화 블록 끄읕 ====")
    }

    fun fly() {
        println("새가 난다.")
    }
    fun sing() {
        println("새가 운다.")
    }

}
