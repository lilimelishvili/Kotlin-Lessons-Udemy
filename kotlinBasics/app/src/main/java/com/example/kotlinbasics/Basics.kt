package com.example.kotlinbasics

fun main() {

    for (i in  1 until 20){
// 10/2 = 5
    // 11/2 = 5.5 which is  5 in term of an  int
        if (i/2 == 5){
            continue
        }
        print("$i ")
    }
    print("done with the loop")
}