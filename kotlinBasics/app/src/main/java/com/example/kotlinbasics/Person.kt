package com.example.kotlinbasics

fun main() {
//val nymbers:IntArray = IntArray(1,2,3,4,5,6,)
    //   val numbers = intArrayOf(1,2,3,4,5,6,)
    val numbers = arrayOf(1, 2, 3, 4, 5, 6,)
    // print(numbers.contentToString())
    val numbersD:DoubleArray = doubleArrayOf(1.0,2.0,3.0,4.0,5.0,6.0)
    print("initial value ${numbers.contentToString()}")
    numbers[0] = 6
    numbers[1] = 5
    numbers[4] = 2
    numbers[5] = 1
    print("\nfinal value ${numbers.contentToString()}")
    val days = arrayOf("Sun","Mon", "tues", "Wed", "thurs","Fri","Sat")
    print(days.contentToString())
  val fruits = arrayOf(Fruit(name = "Apple", price = "2.5"), Fruit(name = "Grape", price = "2.1"  ))
for (index in fruits.indices){
    print("${fruits[index].name} is in index $index")
}
}
data class Fruit(val name:String, val price: String)

