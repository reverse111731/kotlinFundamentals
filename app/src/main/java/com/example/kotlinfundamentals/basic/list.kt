package com.example.kotlinfundamentals.basic

fun main(){
    val month = listOf("Jan", "Feb", "Mar")
    val anyType = listOf(1,2,3, true, false, "String")

    val additionalMonths = month.toMutableList()
    val newMonths = arrayOf("Apr", "May", "Jun")

    additionalMonths.addAll(newMonths)

    print(anyType.size)
    print(month[1])

    print(additionalMonths)

    additionalMonths.add("July")
    additionalMonths.add("Aug")

    print(additionalMonths)

    val days = mutableListOf<String>("Mon","Tues","Wed")
    days.add("Thrus")
    days[2] = "Sun"
    days.removeAt(1)
    val removeList = mutableListOf<String>("Mon", "Wed")
    days.removeAll(removeList)
    print("\n${days}")
    days.removeAll(days)
    print("remove all $days")
}