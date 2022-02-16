package com.example.kotlinbasics

fun main(args:Array<String>){
    var location: Any= "Kotlin"
    var safeString:String?=location as? String
    var safeInt:Int?=location as? Int
    println(safeString)
    println(safeInt)
}