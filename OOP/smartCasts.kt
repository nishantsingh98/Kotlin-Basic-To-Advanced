package OOP

interface drivable {
    fun drive() {
        println(" Driving some vehicle")
    }
}

class Boat : drivable {
    override fun drive(){
        println("Driving boat")
    }

    fun startingEngine() {
        println("Starting engine of boat...")
    }
}

class Bicycle : drivable {
    override fun drive() {
        println("Driving bicycle")
    }

    fun replaceWheel() {
        println("Replacing wheel of bicycle...")
    }
}

fun main() {
    val vehicle:drivable = Bicycle()

    vehicle.drive()
    if (vehicle is Bicycle){
        vehicle.replaceWheel()
    }else if (vehicle is Boat){
        vehicle.startingEngine()
    }
}