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
                field = 1
            } else
                field = value
        }
}

fun main(args: Array<String>) {
    val bangalore = City()
    bangalore.name = "Bangalore"
    bangalore.population = 100
    println("name: ${bangalore.name}, population:${bangalore.population}")

    val delhi = City()
    delhi.name = "New Delhi"
    delhi.population = 0
    println("name: ${delhi.name}, population:${delhi.population}")
}