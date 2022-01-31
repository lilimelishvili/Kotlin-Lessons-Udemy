package com.example.kotlinbasics

//Super Class, Parent Class, Base Class
open class Vehicle{
    //properties
    //methods
}
//Sub Class Child Class or derived class of Vehicle
//Super Class, Parent Class, Base Class of  Vehicle
open class Car(val name: String, val brand: String){

open var range: Double = 0.0
    fun  extendRange(amount: Double) {
        if (amount > 0)
            range += amount
    }
   open fun drive(distance: Double){
        println("drove for $distance KM")
    }


}
//Sub Class Child Class or derived class of Car

class ElectricCar(name: String, brand: String, batteryLife: Double  ): Car(name, brand){

    var chargerType ="Type1"
    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("drove for $distance KM on elecriciy")
    }
fun drive(){
    println("drove for $range KM on elecriciy")
}
}
fun main(){
    var audiA3 = Car(  "A3", "Audi")
    var teslaS = ElectricCar("S-Model", "Tesla", 85.0)
    teslaS.extendRange(200.0)
    teslaS.chargerType = "Type2"

    teslaS.drive()
    // polymorphism
    teslaS.drive(200.0)
    audiA3.drive(200.0)

}