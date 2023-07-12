package com.example.kotlinfundamentals.sealed_enum

// A sealed class with a string property
sealed class Fruit(val type : String)
{
    // Two subclasses of sealed class defined within
    class Apple : Fruit("Apple")
    class Mango : Fruit("Mango")

    // Object
    object newFruit : Fruit("Melon")
}

// A subclass defined outside the sealed class
class Pomegranate: Fruit("Pomegranate")

// A function to take in an object of type Fruit
// And to display an appropriate message depending on the type of Fruit
fun display(fruit: Fruit)
{
    when(fruit)
    {
        is Fruit.Apple -> println("${fruit.type} is good for iron")
        is Fruit.Mango -> println("${fruit.type} is delicious")
        is Pomegranate -> println("${fruit.type} is good for vitamin d")
        is Fruit.newFruit -> println("${fruit.type} this is a Melon object")
    }
}




fun main()
{
    // Objects of different subclasses created
    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = Pomegranate()
    val obj3 = Fruit.newFruit

    // Function called with different objects
    display(obj)
    display(obj1)
    display(obj2)
    display(obj3)
}
