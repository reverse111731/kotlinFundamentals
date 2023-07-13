package com.example.kotlinfundamentals.solid_principle


abstract class Shape {
    abstract fun calculateArea(): Double
}

class Rectangle(var width: Double, var height: Double) : Shape() {
    override fun calculateArea(): Double {
        return width * height
    }
}

class Circle(var radius: Double) : Shape() {
    override fun calculateArea(): Double {
        return Math.PI * Math.pow(radius, 2.0)
    }
}

//class Triangle(var base: Double, var height: Double) : Shape(){
//    override fun calculateArea(): Double {
//        return 0.5 * (base * height)
//    }
//}

interface AreaCalculator {
    fun calculate(shape: Shape): Double
}

class RectangleCalculator : AreaCalculator {
    override fun calculate(shape: Shape): Double {
        return (shape as Rectangle).width * (shape as Rectangle).height
    }
}

class CircleCalculator : AreaCalculator {
    override fun calculate(shape: Shape): Double {
        return Math.PI * Math.pow((shape as Circle).radius, 2.0)
    }
}

//class TriangleCalculator : AreaCalculator {
//    override fun calculate(shape: Shape): Double {
//        val triangle = shape as Triangle
//        return triangle.base * triangle.height / 2.0
//    }
//}
