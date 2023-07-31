package com.example.kotlinfundamentals.solid_principle

class Student {
    var name: String = ""
    var age: Int = 0
    var marks: Int = 0

    // Only Calculate Grade
    fun calculateGrades() : String {
        return "Student grade being calculated"
    }

    // Only Prints student grade
    fun printStudentInformation() {
        println("Student grade .....")
    }
}

fun main(){
    var student:Student = Student()

    student.printStudentInformation()

    val test = student.calculateGrades()

    print(test)
}