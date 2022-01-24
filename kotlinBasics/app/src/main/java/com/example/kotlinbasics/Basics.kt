package com.example.kotlinbasics

fun main () {
     var  x  = 100
    while (x >= 0 ){
        print("$x")
        x -= 2
    }
        println("\n while loop is done")

     x = 1
     do{
         println("$x")
        x++
     }while (x <= 10)
    println("\ndo while loop is done")

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp ++
        if (roomTemp >= 20){
            feltTemp = "compy"
            println("It's compy now")
        }
    }
     for (num in 1..10) {
        print("$num") }
    for (i in 1 until 10){ // Same as - for (i in 1.until(10))
        print("$i ")
    }
     println("____________")
    for (i in 10 downTo  1 step 2){// Same as - for (i in 10 downTo(1).step(2))
        print("$i ")
    }





}








