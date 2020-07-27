package basics.higherOrderFunctions

fun main(args: Array<String>) {
    zip()
}

fun zip() {
    val letters = listOf("Nishant Singh ", "Vinay Kumar", "Prashant Singh")
    val numbers = (1..4).toList()

    val zipped = letters.zip(numbers)
    println("zipped elements are $zipped")

    val mapped = letters.zip(letters.map { it.contains("Singh") })
    println("mapped elements having Singh as surname  $mapped")
}