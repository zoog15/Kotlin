package com.example.myapplication

open class Human(val name : String = "Anonymous"){

    // 부 생성자
    constructor(name : String, age : Int) : this(name) {
        println("my name is ${name}, ${age}years old")
    }

    // 인스턴스 생성할떄 어떤 동작할지 설정
    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so yummy")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("라라라")
        println("my name is ${name}")
    }
}

fun main(){
    val korean = Korean()
    korean.singASong()
}