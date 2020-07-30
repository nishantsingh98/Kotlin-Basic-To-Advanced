package OOP

//Extension function
fun Int.isEven() = (this % 2 == 0)
fun City.isLarge() = (this.population >= 100)

//Note if we do not take input from the user then we don't need to pass arguments in main
fun main() {
    val random= City()
    random.name="random"
    random.population=1000
    println("${random.name} is a large city? ${random.isLarge()}")

    println("5 is even? ${5.isEven()}")
}