package OOP

class City() {
    var name: String = ""
        get() = field
        set(value) {
            if (value.isNotBlank()) {
                field = value.toUpperCase()
            }
        }
    var population: Int = 0
        get() = field
        set(value) {
            if (value == 0) {
                field = value + 1000
            }
        }

}

fun main(args: Array<String>) {
    val bangalore = City()
    bangalore.name = "Bangalore"
    bangalore.population = 1000
    println("name: ${bangalore.name}, population${bangalore.population}")

    val delhi = City()
    delhi.name = "New Delhi"
    println("name: ${delhi.name}, population${delhi.population}")

}