package com.example.myapplication

// Singleton Pattern
// 이 클래스를 읽어올때 한번만 생성하고 다시는 생성안함, 불필요한 메모리 낭비 방지
object CarFactory {
    val cars = mutableListOf<Car>()
    fun makeCar(horsePower : Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(val horsePower : Int)

fun main(){
    val car = CarFactory.makeCar(10)
    val car2 = CarFactory.makeCar(200)

    println(car)
    println(car2)
    println(CarFactory.cars.size.toString())
}