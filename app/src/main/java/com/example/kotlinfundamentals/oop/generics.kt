package com.example.kotlinfundamentals.oop


// Generic Class
class Persons<T>(age: T){
    var age: T = age
    init {
        this.age= age
        println(age)
    }
}
//fun main(args: Array<String>){
//    var ageInt: Persons<Int> = Persons<Int>(30)
//    var ageString: Persons<String> = Persons<String>("40")
//}


fun main(args: Array<String>){

//    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
//    val s: String = stringList[0]

//    println("printing the string value of stringList: $s")
//    printValue(stringList)
//
//    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
//    printValue(floatList)


    val stringList: ArrayList<String> = arrayListOf<String>("Ashu","Ajay")
    stringList.printValue()
    val floatList: ArrayList<Float> = arrayListOf<Float>(10.5f,5.0f,25.5f)
    floatList.printValue()

}

//// Generic Function
//fun <T>printValue(list: ArrayList<T>){
//    for(element in list){
//        println(element)
//    }
//}

// Generic Extended function
fun <T>ArrayList<T>.printValue(){
    for(element in this){
        println(element)
    }
}