package OOP

import kotlin.math.pow

//all classes in kotlin are final by default hence we explicitly need to use open keyword
open class Parent
class Child : Parent()

open class Shape(val name: String) {
    init {
        println("in the parent class ")
    }

    //function are final by default
    open fun area() = 0.0
}

class Circle(name: String, val radius: Double) : Shape(name) {
    init {
        println("inside sub class ")
    }

    override fun area() = Math.PI * radius.pow(2.0)
}

fun main() {
    val newCircle = Circle("Circle", 4.0)

    println(newCircle.name)
    println(newCircle.radius)
    println(newCircle.area())
}