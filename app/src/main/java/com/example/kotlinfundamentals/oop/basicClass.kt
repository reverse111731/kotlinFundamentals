package com.example.kotlinfundamentals.oop

fun main(){
    var burt = Person("Burt", "Co", 26)
    burt.stateHobby()
    burt.age = 27
    println(burt.age)
    var jude = Person()
    jude.hobby = "Read Manga"
    jude.stateHobby()

}

class Person (firstName: String = "Jude", lastName: String = "Sy"){
    //Member Variables / Properties
    var age: Int? = null
    var name: String? = null
    var hobby: String = "Watch Anime"

    //Initializer block
    init{
        name = firstName
        println("Int a new person Object with firstname = $firstName and lastname = $lastName")
    }

    //Secondary Constructor
    constructor(
        firstName: String,
        lastName: String,
        age: Int
    ): this(firstName,lastName){
        this.age = age
    }

    //Member Function / Methods
    fun stateHobby(){
        println("$name\'s hobby is $hobby")
    }
}


//fun main(){
//    var myCar = Car()
//    println("brand is: ${myCar.myBrand}")
//    myCar.maxSpeed = 300
//    println("MaxSpeed is: ${myCar.maxSpeed}")
//
//}

open class Car() {
    lateinit var owner: String

    val myBrand: String = "BMW"
        //Custom getter
        get() {
            return field.lowercase()
        }

    var maxSpeed: Int = 250
        //get() = field
        set(value) {
            field = if(value >0) value else throw IllegalArgumentException("Error")
        }

    var myModel: String = "M5"
        private set


    init{
        this.myModel ="M3"
        this.owner= "No One"
    }
}