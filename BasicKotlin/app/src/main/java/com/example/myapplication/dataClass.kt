package com.example.myapplication

data class Ticket(val companyName : String, val name : String, var date : String,
    var seatNumber : Int)
// toString(), hashCode(), equals(), copy() 사용 가능

class TicketNormal(val companyName : String, val name : String, var date : String,
    var seatNumber : Int)

fun main(){
    var ticketA = Ticket("koreanAir","joyceHong","2020-02-16", 14)
    var ticketB = TicketNormal("koreanAir","joyceHong","2020-02-16", 14)

    // 내용이 나옴
    println(ticketA)
    // 데이터 주소가 나옴
    println(ticketB)
}