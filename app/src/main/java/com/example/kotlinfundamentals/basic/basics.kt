package com.example.kotlinfundamentals.basic

fun main(){
//    var name :String = "Burt"
    var nullableName :String? = "Oliver"

//    var len = name.length
    var len2 = nullableName?.length

//    println(nullableName?.lowercase())
    nullableName?.let { println(it.length) }

    nullableName = null

    // ?: Elvis Operator
    var name = nullableName ?: "Guest"


    println(name)
}

//fun main(){
//    //Immutable variable
//    val myName = "Burt Co"
//    // Mutable variable
//    var secondName = "Oliver"
//
//
//    var myAge = 26
//    var myFloat = 13.77F
//    var myDouble: Double = 3.141592653
//
//    var isSunny = true
//    isSunny = false
//
//    var myChar = 'A'
//    var firstCharInStr = myName[0]
//    var lastCharInString = myName[myName.length-1]
//
////    println("Hello $myName")
////    println(firstCharInStr)
////    println(lastCharInString)
//
//    var result:Double = 5+3.0
//    result *= 3.11731
////    print(result)
//
//    var boolResult =  5<=5 //4<1 //5>0 //3==3
////    print(boolResult)
//
//    var myNum = 5
//    myNum +=10
////    print(myNum)
//
//    val age = 40
//
////    if(age == 18){
////        println("are exact 18")
////    }
////    else if (age >= 18){
////        println("you can drink")
////        if(age > 30){
////            print("hey you are over 30")
////        }
////    }
////    else{
////        println("You are too young")
////    }
//
//    var season = 4
////    when(season){
////        1 -> println("Spring")
////        2 -> println("Summer")
////        3 -> {
////            println("fall")
////            println("autumn")
////        }
////        4 -> println("Winter")
////        else -> println("Do no understand")
////    }
//
//    var month = 12
////    when(month){
////        in 3..5 -> println("Spring")
////        in 6..8 -> println("Summer")
////        in 9..11 -> println("Fall")
////        12,1,2 -> println("Winter")
////        else -> print("Invalid season")
////    }
//
//    var x = 19
////    while(x <= 10){
////        println(x)
////        x++
////    }
//
//    do{
//        println("X: " + x)
//        x++
//    }while(x<=10)
//
//    // For Loop
//    // A for-loop is used to iterate through ranges, arrays, collections, or anything
//    // that provides an iterator (You’ll learn about iterator, arrays, ranges and collections in a future lectur    e).
//    for(num in 1..10) {
//        print("$num ")
//    }
//
//    // infix notation
//    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
////        print("$i ")
//    }
//
//    for(i in 10 downTo 1) {     // Same as - for(i in 10.downTo(1))
////        print("$i ")
//    }
//
//    for(i in 1 until 10 step 2) { // Same as - for(i in 1.until(10).step(2))
//        print("$i ")
//    }
//for(i in 1 until 20){
//    if(i/2 == 5){
//        continue
//    }
//    print("$i ")
//}
//print("for loop has ended")
//}