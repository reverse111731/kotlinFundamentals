package com.example.kotlinfundamentals.basic

fun main(){
    myFunction()
    var result: Int = addUp(5,3)
    println(result)
    var resultAvg: Double = avg(11.17, 19.31)
    println("avg is $resultAvg")
}

fun addUp(a: Int, b: Int): Int {
    return a + b
}

fun avg(a: Double, b: Double): Double{
    return (a+b/2)
}

fun myFunction(){
    println("Called from function")
}
