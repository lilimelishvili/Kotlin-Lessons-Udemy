package com.example.kotlinbasics




fun main(){
    //var name :String = "Lily"
    //name=null -> Compilation ERROR
    var nullableName: String? = "Lily"
    //null.also { nullableName = it }


    var  len = nullableName?.length
    nullableName?.let { println(it.length) }


    // ?: Elvis operator
    val name = nullableName  ?: "Guest"
    println("name is $name")

    nullableName!!.toLowerCase()

    /*if (nullableName != null){
        var  len2 = nullableName.length

    }else{
        null
    }*/
}

private fun String.forEach() {
    TODO("Not yet implemented")
}
