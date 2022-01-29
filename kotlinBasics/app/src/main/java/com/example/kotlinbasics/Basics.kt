package com.example.kotlinbasics



fun main() {
    ///Method - a Method is a Function within a class
    //argument
    var avg = avg( a =  5.3, b = 13.37 )
   print("result is  $avg")
}

fun avg(a: Double, b: Double): Double{
    return (a+b)/2
}
// Parameter (input)
fun addUp(a: Int, b: Int) : Int{
    // (output)
    return a+b
}
fun myFunction  (){
    print("Called from myFuncion ")
}