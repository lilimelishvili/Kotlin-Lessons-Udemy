package com.example.kotlinbasics

fun main(args:Array<String>) {
    val arrayList:ArrayList<String> = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    for (i in arrayList){
        println(i)
    }
    println("....arrayList.get(1).....")
    println(arrayList.get(1))

}
