package com.example.kotlinbasics
/*
Exercise Variables And Datatypes
Please write a program in which you are assigning those values to variables with the right (specific) data type:
"Android Masterclass"
13.37F
3.14159265358979
25
2020
18881234567
true
'a'
Please don't simply use Kotlin's powerful type inference feature for this.
For example, write
var age : Short = 25
and not
var age = 25
even though both are correct. This is just for testing your understanding of the different basic data types.
All of them should be "var", except for the pi value and 13.37, use "val" here.
Try to use descriptive and useful names
 */
fun main(){
    var courseName :String = "Android Masterclass"
    val leet : Float = 13.37F
    val pi : Double = 3.14159265358979
    var age : Byte = 25
    var year : Short = 2020
    var phoneNumber: Long = 18881234567
    var isGood : Boolean = true
    var firstCharacter : Char = 'a'
}