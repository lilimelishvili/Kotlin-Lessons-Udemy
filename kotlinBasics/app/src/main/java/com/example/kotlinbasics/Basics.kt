package com.example.kotlinbasics

import kotlin.system.measureTimeMillis

fun main() {
    var myCar = Car()
    println ("brand is : ${myCar.myBrand}")
    myCar.maxSpeed = 200
    println("Maxspeed is ${myCar.maxSpeed}")
    println( " My car model is ${myCar.myModel}")
        }

class Car (){
   lateinit var owner : String
   val myBrand: String = "BMW"
       // custom getter
    get() {
        return field.toLowerCase()
    }
    var maxSpeed: Int = 250
    get() = field
    set(value) {
        field = if(value > 0) value else  throw IllegalArgumentException("Maxspeed cannot be less than ")
    }
    var myModel : String = "M5"
    private set

    init {
        this.myModel = "M3"
       this.owner = "Frank"
   }
}
