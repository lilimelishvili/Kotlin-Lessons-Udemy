package com.example.kotlinbasics

fun main () {
    // immutable variable
    // TODO: Add new functionality
    /*
    This
    is a multiline
    comment
     */
    // type string
    var myName = "Lily"
    // type int 32 bit
    // type inference
    var myAge = 32
    // Integer TYPES: Byte ( 8 bit ) Short ( 16 bit )  Int  ( 32 bit )  Long ( 64 bit )
    val myByte: Byte = 13
    val myShot: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 39_812_309_487_120_300


    // Floating Point number Types :  Float ( 32 bit), Double ( 64 bit )
    val myFloat = 13.37F
    val myDouble = 3.1459265358979323846

    //Boolean is a type which represents logical values.
    // It can have two possible values, true and false.
    var isSunny: Boolean = true
    isSunny = false
    //Characters
    var letterChar = 'A'
    var digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]
    var myLength = myStr.length


    //print ("first character $firstCharInStr and the length of myStr is ${myStr.length}")


    // arithmetic operation  (+,  - ,  * , / , % )
    var result = 5 + 3
    val a = 5.0
    val b = 3
    var resultDouble: Double
    resultDouble = a / b
    //print (resultDouble )

    //Comparison operators (== , !=, <, >, <=, >=)
    val isEqual = 5 == 3
    //println ("isEqual is $isEqual")

    val isNotEqual = 5 != 5
    //String interpolation
    /* println ("isNotEqual ${5!=5}")
    println ("is-5less3 ${-5<3}")
    println ("is5greater3  ${5>3}")
    println ("is5lower3   ${5<=3}")
    println ("is5Greater3 ${5>=3}")*/

    //Assignment operators (+=, -=, *=, /=, %=)
    var myNum = 5
    myNum += 3

    myNum *= 4
    //println("myNum is $myNum")

    //Increment & Decrement operators (++, --)

    myNum++
    /*println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")*/

    var heightPerson1 = 170
    var heightPerson2 = 156

    if (heightPerson1 > heightPerson2) {

        println("use row force")
    }else if (heightPerson1 == heightPerson2){
        println("use your power teachnique 1337")
    } else {
        println("use teachnique")
    }

    val age = 17
    if (age >= 21){
        println("now you may drink in the US")
    }else if (age >=18){
        println("you may vote now")
    }else if (age >= 16) {
        println("you may drive now")
    }else {
        println("you're too young")
    }
    when  (age){
        !in 0..20 ->  println("now you may drink in the US")
        in 18..20 -> println("you may vote now")
        16, 17 -> println("you may drive now")
        else ->   println("you're too young")

    }
    var x : Any = "13.37f"
    when (x){
        is Int -> println("$x is an Int")
        !is Double -> println("$x isn't a Double")
        is String -> println("$x is a String")
        else -> println("$x is  none of the above")
    }


    var name = "Lily"

    if (name == "lily"){
        println("Welcome home lily")
    }else   {
        println("Who are you?")
    }
    val isRainy = true
    if (isRainy){
        println("It's rainy")
    }




    var season  = 3
    when(season){
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else  -> println("Invalid Season")
    }
     var month = 3
     when(month){
         in 3..5 -> println("Spring")
         in 6..8 -> println("Summer")
         in 9..11 -> println("Fall")
         in 12..2 -> println("Winter")

         else  -> println("Invalid Season")

     }
}




