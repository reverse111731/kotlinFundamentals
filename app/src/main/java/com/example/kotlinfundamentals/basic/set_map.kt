package com.example.kotlinfundamentals.basic

fun main(){
    //Sets
    val fruits = setOf("Apple","Banana","Grape","Apple","Mango","Banana")
    println(fruits)
    println(fruits.size)
    println(fruits.toSortedSet())

    val newFruit = fruits.toMutableList()
    newFruit.add("Melon")
    newFruit.add("Pear")
    println(newFruit)
    println(newFruit.elementAt(4))

    //Maps
    val daysOfWeek = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    println(daysOfWeek[2])

    for(key in daysOfWeek.keys){
        println("$key is to ${daysOfWeek[key]}")
    }

    val fruitMap = mapOf("ok" to Fruit("grape", 2.5), "favorite" to Fruit("apple", 3.5), "prefered" to Fruit("banana", 5.5), "dislike" to Fruit("mango", 12.5))

}