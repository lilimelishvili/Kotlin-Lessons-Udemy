package com.example.kotlinbasics

class OuterClass {
    //outerclass code
    private var name: String = "MR X"

    inner class InnerClass{
       // Inner Class code
        var description:String="code inside inner class"
        private var id:Int = 101
        fun foo(){
            println("name is ${name}")// access the private outer class member
            println("Id is ${id}")
        }
    }
       }
fun main(args:Array<String>){
    println(OuterClass().InnerClass().description)//accessing property
    var obj = OuterClass().InnerClass()//object creation
    obj.foo()//access member function
}