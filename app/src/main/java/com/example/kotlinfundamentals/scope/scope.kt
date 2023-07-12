package com.example.kotlinfundamentals.scope

import android.content.Intent


fun main(){

    var number: Int? = null
    var i = 0

    //LET = act as a checker for null
    val x = number?.let {
        val number2 = it + 1
        print(number2)
        number2 // returns the last line
    } ?: 3 // This is Elvis Operator



    // Also - Similar with Let but does not return last Line but all of it
    // It also extend or add an extra behavior
    fun getSqr() = {i * i}.also {
        i++
    }

    // Apply - just apply extra
    // return object
    val intent = Intent().apply{
        putExtra("", "")
        putExtra("", 0)
        action = ""

    }
    val adam = Person("Adam").apply {
        age = 32
        city = "London"
    }
    println(adam)

    // Run - Does the same with Apply, but return the last line
    intent.run{}

    // With is just the same with run
    with(Intent()){

    }
}


class Person(
    var name: String,
){
    var age: Int = 0
    var city: String = ""
}