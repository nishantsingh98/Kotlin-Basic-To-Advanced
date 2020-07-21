package basics

fun main(args: Array<String>) {
    map()
}

fun map() {
    val list=(1..10).toList()
    println("My list is $list")

    //maps every element to its respective value of lambda expression
    val doubleValue =list.map { element -> element*2 }
    println("Doubled value is $doubleValue")
}