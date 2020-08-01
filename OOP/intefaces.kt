package OOP

//Only method and property declaration but no implementation 
interface Cars {
    val fuelCapacity: String
    fun drive(): String
}

class Sedan : Cars {
    override val fuelCapacity = "100 L"

    override fun drive() = "Driving a sedan car "
}

class Sports : Cars {
    override val fuelCapacity = "40L"

    override fun drive() = "Driving a sports car "

}

fun main() {
    val sedan = Sedan()
    println("${sedan.drive()}fuel capacity is ${sedan.fuelCapacity}")

    val sports = Sports()
    println("${sports.drive()}fuel capacity is ${sports.fuelCapacity}")
}