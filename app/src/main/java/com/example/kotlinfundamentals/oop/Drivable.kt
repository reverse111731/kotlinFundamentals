package com.example.kotlinfundamentals.oop

interface Drivable{
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("The drivable is braking")
    }
}