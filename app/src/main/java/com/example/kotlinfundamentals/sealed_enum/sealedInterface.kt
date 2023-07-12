package com.example.kotlinfundamentals.sealed_enum

sealed interface Animal {
    val name: String
    fun makeSound()
}

class Dog(override val name: String): Animal {
    override fun makeSound() {
        println("$name says woof!")
    }
}

class Cat(override val name: String): Animal {
    override fun makeSound() {
        println("$name says meow!")
    }
}

fun main(){
    val myDog = Dog("Rufus")
    val myCat = Cat("Whiskers")

    myDog.makeSound() // outputs: "Rufus says woof!"
    myCat.makeSound() // outputs: "Whiskers says meow!"

}

// Another example of sealed interface
sealed interface State {
    object Idle : State
    data class Loading(val message: String) : State
    data class Error(val error: Throwable) : State
    data class Success(val data: Any) : State
}