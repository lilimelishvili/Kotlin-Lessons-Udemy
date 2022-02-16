package com.example.kotlinbasics

class OuterClass {
    //outerclass code
    private var name: String = "MR X"

    class NestedClass {
        //nestedclass code
        var descrption: String = "code inside nested class"
        private var id: Int = 101
        fun foo() {
            //pint("name is ${name}") //cannot access the outer class member
            println("Id is ${id}")
        }
    }
}