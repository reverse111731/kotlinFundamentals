package com.example.kotlinfundamentals.solid_principle

interface Swimming {
    fun swim()
}

interface Flying {
    fun fly()
}

class Duck : Swimming, Flying {
    override fun swim() = println("Duck is swimming")
    override fun fly() = println("Duck is flying")
}

class Penguin : Swimming {
    override fun swim() = println("Penguin is swimming")
}

class Cat{
    fun run() = println("Cat is running")
    fun swim() = println("Cat can swim but they do not like it")
}

// Accept classes with inherited Swimming interface, almost similar to inheritance class
fun makeAnimalsSwim(animals: List<Swimming>) {
    for (animal in animals) {
        animal.swim()
    }
}

fun main(){
    val ducks = listOf(Duck(), Duck())
    makeAnimalsSwim(ducks) // prints "Duck is swimming" twice

    val penguins = listOf(Penguin(), Penguin())
    makeAnimalsSwim(penguins) // prints "Penguin is swimming" twice

    val cats = listOf(Cat(), Cat())
    // Error cause cat does not implement swimming interface
//    makeAnimalsSwim(cats)
}