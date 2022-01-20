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
    val myInt:  Int = 123123123
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
    var firstCharInStr = myStr [0]
    var lastCharInStr = myStr[myStr.length - 1]


    print ("Last character " + lastCharInStr)
}