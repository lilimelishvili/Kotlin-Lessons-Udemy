package com.example.kotlinbasics

fun main() {
    //Creating instances of classes
  var denis = Person("Lily", "Ime")
    var Gio = Person ()
    var GioEpita = Person (lastName = "Epita")
}

class Person(firstName: String = "Gio", lastName: String = "Epo" ){


    //initializer Block
    init {
        println("Initialized a new Person object with " +
                "firstName = $firstName, lastName = $lastName")
    }
}