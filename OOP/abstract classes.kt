package OOP

import kotlin.math.pow

//Abstract class can't be instantiated and their methods Don't need to have default implementation or values
abstract class AbstractShape(val name: String) {
    //no need to have a initial value or a function body here
    abstract fun area(): Double
}

class AbstractCircle(name: String, val radius: Double) : AbstractShape(name) {
    override fun area() = Math.PI * radius.pow(2.0)
}

fun main() {
    val smallCircle = AbstractCircle("Circle", 2.34)
    println(smallCircle.area())
}
