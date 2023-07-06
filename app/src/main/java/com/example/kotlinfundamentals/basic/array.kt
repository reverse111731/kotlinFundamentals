package com.example.kotlinfundamentals.basic

fun main(){
//    val numbers: IntArray = intArrayOf(1,2,3,4,5,6)
//    val numbers = intArrayOf(1,2,3,4,5,6)
    val numbers = arrayOf(1,2,3,4,5,6)
    print("initial values ${numbers.contentToString()}")
    numbers[3] = 20
    numbers[4] = 30
    numbers[5] = 40
    print("\nfinal values ${numbers.contentToString()}")
//    print(numbers[3])

    val days = arrayOf("\nSunday", "Monday", "Tuesday", "Wed", "Thurs", "Fri", "Sat")
    println(days.contentToString())

    val fruits = arrayOf(Fruit(name = "Apple", price = 11.17), Fruit(name = "Banana", price = 31.17), Fruit(name = "Mango", price = 19.17), Fruit(name = "Grape", price = 17.17))
    println(fruits.contentToString())

    for(fruit in fruits){
        print("${fruit.name}, ")
    }

    for(index in fruits. indices){
        println("${fruits[index].name} is in the index $index")
    }
}

data class Fruit(val name:String, val price:Double)