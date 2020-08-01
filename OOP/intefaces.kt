package OOP

//Only method and property declaration but no implementation
interface Cars {
    val fuelCapacity: String
    fun drive(): String
}

interface Bike {
    val fuelCapacity: String
    fun drive() {
        print("Riding Bike ")
    }

}

interface Cycle {
    fun drive(){
        print("Riding cycle ")
    }
}

class Yamaha : Bike, Cycle {
    override val fuelCapacity = "100 L"

    //Here ambiguity is removed with the help of super<Class>.methodName()
    override fun drive() {
        super<Bike>.drive()
    }
}

class Sports : Cars {
    override val fuelCapacity = "40L"
    override fun drive() = "Driving a sports car "
}

//to remove ambiguity when multiple interfaces are implemented by the same class

fun main() {
    val bike = Yamaha()
    println("${bike.drive()}fuel capacity is ${bike.fuelCapacity}")

    val sports = Sports()
    println("${sports.drive()}fuel capacity is ${sports.fuelCapacity}")
}