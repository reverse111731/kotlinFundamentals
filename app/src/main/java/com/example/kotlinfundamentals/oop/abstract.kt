package com.example.kotlinfundamentals.oop

abstract class Mammal(private val name:String, private val origin:String, private var weight:Double){
    abstract var maxSpeed: Double

    abstract fun run()
    abstract fun breath()

    fun displayDetails(){
        println("Name: $name, Origin: $origin, Weight: $weight, MaxSpeed: $maxSpeed")
    }
}

class Human(name:String, origin:String, weight:Double, override var maxSpeed: Double): Mammal(name, origin, weight){
    override fun run() {
        println("Run on 2 legs")
    }

    override fun breath() {
        println("Breath from nose")
    }

}

class Elephant(name: String, origin: String, weight: Double, override var maxSpeed: Double):Mammal(name,origin,weight){
    override fun run() {
        println("Run on 4 legs")
    }

    override fun breath() {
        println("breath from trunk")
    }
}

fun main(){
    val human = Human("Burt", "ph", 52.0, 13.1)
    val elephant = Elephant("rosy", "af", 1001.10, 30.5)


    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

    human.displayDetails()
    elephant.displayDetails()
}