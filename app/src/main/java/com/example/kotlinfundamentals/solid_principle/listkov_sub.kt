package com.example.kotlinfundamentals.solid_principle

open class Animal {
    open fun move() = println("Animal is moving")
}

class Bird : Animal() {
    override fun move() = println("Bird is flying")
}

// Does not inherit Animal
class Dog{
    fun move() = println("Dog is moving")
}


// LSP
fun makeAnimalsMove(animals: List<Animal>) {
    for (animal in animals) {
        animal.move()
    }
}

fun main(){
    val animal = Animal()
    animal.move() // prints "Animal is moving"

    val bird = Bird()
    bird.move() // prints "Bird is flying

    val animals = listOf(Animal(), Animal())
    makeAnimalsMove(animals) // prints "Animal is moving" twice

    // Sample of LSP = sub Animal with Bird since Bird class is also an Animal Class base on inheritance
    val birds = listOf(Bird(), Bird())
    makeAnimalsMove(birds) // prints "Bird is flying" twice

    val dogs = listOf(Dog(), Dog())
    // Error because Dog does not inherit Animal Parent class
//    makeAnimalsMove(dogs)
}