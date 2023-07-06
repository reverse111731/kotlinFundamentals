package com.example.kotlinfundamentals.oop

fun main(){
    val stringList: List<String> = listOf("Burt", "Jude", "Ken")
    val mixTypeList: List<Any> = listOf("Burt", 17, 7, "Bday", 52.0, "weight", "kg")

    for(value in mixTypeList){
        when (value) {
            is Int -> {
                println("Int value is $value")
            }
            is Double -> {
                println("Double value is $value")
                Math.floor(value)
            }
            is String -> {
                println("String value is $value of length ${value.length}")
            }
            else -> {
                println("Unknown Type")
            }
        }
    }
    //Smart Cast
    val obj1: Any = "I have a dream"
    if (obj1 !is String){
        println("Not a String")
    }
    else{
        println("Found a String of length ${obj1.length}")
    }

    val str1: String = obj1 as String
    println(str1.length)

    //Explicit (unsafe) Casting using the "as" keyword - can go wrong
//    val obj2: Any = 1337
//    val str2: String = obj2 as String
//    println(str2)

    //Explicit (safe) Casting using the "as?" keyword
    val obj3: Any = 1337
    val str3: String? = obj3 as? String
    println(str3) // Print Null
}