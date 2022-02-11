package com.example.kotlinbasics

fun main() {
    val fruits = setOf("Orange", "Apple", "Mango", "Grape", "Apple")
    //print(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    //println(newFruits.elementAt(4))

    val daysOFTheWeek = mapOf(1 to "Monday",   2 to "Tuesday",    3 to "Wednesday")
    println(daysOFTheWeek[2])

    for (key in daysOFTheWeek.keys) {
        print("$key is to ${daysOFTheWeek[key]}")
    }
val fruitsMap = mapOf("Favorite" to Fruit("Grape",2.5),
    "OK" to Fruit("Appl", 1.0) )
    val newDaysOfWeek = daysOFTheWeek.toMutableMap()
    newDaysOfWeek[4] = "Thursday"
    newDaysOfWeek[5] = "Friday"
 print(newDaysOfWeek.toSortedMap())
}

data class  Fruit(val name: String, val price: Double)

