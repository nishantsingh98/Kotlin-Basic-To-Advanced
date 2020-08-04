package OOP

open class Animal() {
    fun eat() = "eat"
    fun sleep() = "sleep"
}

open class Dog() : Animal() {
    fun bark() = "bark"
}

class Baby() : Dog() {
    fun cry() = "cry"
}

fun main() {
    val smallPup = Baby()
    println(smallPup.eat())
    println(smallPup.sleep())
    println(smallPup.bark())
    println(smallPup.cry())
}