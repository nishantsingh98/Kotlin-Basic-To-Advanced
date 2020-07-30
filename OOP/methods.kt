package OOP

class State(val name: String, var pincode: String) {
    init {
        name.toUpperCase()
        pincode = "#" + pincode
    }

    //method
    fun printData() {
        print("name:$name, pincode:$pincode")
    }
}

fun main(args:Array<String>) {
    val delhi = State("New Delhi", "285001")
    delhi.printData()
}