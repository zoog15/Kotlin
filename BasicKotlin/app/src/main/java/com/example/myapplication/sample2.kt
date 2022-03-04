package com.example.myapplication

val square : (Int) -> (Int) = {number -> number*number}

val nameAge  = {name : String, age : Int ->
    "my name is ${name}, I'm ${age} years old"
}

fun main(){
    println(square(12))
    println(nameAge("joyce",99))

    val a = "joyce said"
    val b = "mac said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 28))

    println(calculateGrade(97))

    val lamda = {number : Double ->
        number == 4.3213
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it > 3.22}))
    println(invokeLamda{it > 3.22})
}

val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun extendString(name : String, age : Int) : String {
    val introduceMyself : String.(Int) -> String = {
        "I am ${this} and ${it} years old"
    }

    return name.introduceMyself(age)
}

val calculateGrade : (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

fun invokeLamda(lamda : (Double) -> Boolean) : Boolean {
    return lamda(5.2343)
}