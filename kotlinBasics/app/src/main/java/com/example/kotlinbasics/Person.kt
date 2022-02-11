package com.example.kotlinbasics

fun main() {
    val months = listOf("Januari", "Fabruary", "March")
    val anyTypes = listOf(1,2,3,true,false,"string")
    //print(anyTypes.size)
   // print(months[1])

    /*for (month in months){
        println(month)
    }*/
    val adionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    adionalMonths.addAll(newMonths)
    adionalMonths.add("July")
    //print(adionalMonths)


    val days = mutableListOf<String>("Mon", "Tue", "Wed")
    days.add("Thu")
    days[2] = "Sunday"
    //days.removeAt(3)
    val removelist = mutableListOf<String>("Mon", "Wed")
    //days.removeAll(removelist)
    days.removeAll(days)
    print(days)


}