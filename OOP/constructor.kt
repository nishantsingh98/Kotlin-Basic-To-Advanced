package OOP

//Primary constructor
class Country(val name: String, val area: Long) {
    // also Primary constructor
    init {
        println("in the Primary constructor ")
        println("name:$name, area:$area")
    }

    //secondary constructor
    constructor(name: String) : this(name, 0) {
        println("in the Secondary constructor ")
        println("name:$name")
    }
}

fun main(args: Array<String>) {
    val india = Country("India", 100_000_000)
    val china = Country("China")
}