package com.example.kotlinfundamentals.oop


// The Class that inherits the feature of another class
// Class is called the Sub Class or child class or Derived class and the other class whose feature are inherited is called super class or parent class or base class


open class Vehicle(override val maxSpeed: Double, val name: String, val brand: String): Drivable{
    open var range: Double = 0.0

    fun extendRange(amount:Double){
        if(amount > 0){
            range += amount
        }

    }

    override fun drive(): String {
        return "driving the interface drive"
    }

    open fun drive(distance:Double){
        println("Drove for $distance KM")
    }

}

class ElectricCar(maxSpeed: Double, name: String, brand: String, batLife: Double): Vehicle(maxSpeed, name, brand){
    var chargerType = "Type1"
    override var range = batLife * 8

    override fun drive(distance:Double){
        println("Drove for $distance KM on electricity")
    }

    override fun drive(): String{
        return "Drove for range $range"
    }

    override fun brake() {
        super.brake()
        print(" brake msg from electric car \n")
    }
}

fun main() {
    var myCar = Vehicle(300.0, "A3", "Audi")
    var myECar = ElectricCar(350.0, "S-model", "tesla", 85.0)
    myECar.chargerType = "type2"
    myECar.extendRange(100.50)
    myCar.drive(200.0)
    myECar.drive(500.0)
    myECar.drive()

    myECar.brake()

    myCar.brake()
}
