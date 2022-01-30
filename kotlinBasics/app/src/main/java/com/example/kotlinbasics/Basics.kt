package com.example.kotlinbasics

fun main() {
    //Creating instances of classes
  var denis = Person("Lily", "Ime", 31)
    denis.hobby = "tu skateboard"
    denis.age = 32
    println("Lily is ${denis.age} years old" )
    denis.stateHobby()
    var Gio = Person ()
    Gio.hobby = "play video games"
    Gio.stateHobby()
   // var GioEpita = Person (lastName = "Epita")
}

class Person(firstName: String = "Gio", lastName: String = "Epo" ){
     // Member Variable - Properties
    var age : Int? = null
    var hobby : String = "Watch Netflix"
    var firstName : String? = null

    //initializer Block
    init {
        this.firstName = firstName
        println("Initialized a new Person object with " +
                "firstName = $firstName, lastName = $lastName")

    }

    // Member seconary Constructor

    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName){
        this.age = age
    }



    // Member functins - Methods
    fun stateHobby(){
        println("$firstName\'s  hobby is $hobby")
    }


}