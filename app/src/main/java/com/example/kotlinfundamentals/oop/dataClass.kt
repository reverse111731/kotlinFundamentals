package com.example.kotlinfundamentals.oop

data class User(val id: Long, var name: String)

fun main(){
    var user1 = User(id = 1, name = "Burt")
    var name = user1.name
    println(name)
    user1.name = "Oliver"
    var user2 = User(2, "Jude")

    println(user1 == user2)

    var updatedUser = user1.copy(name="Burt Oliver Co")
    println(updatedUser)
}