package basics

fun main(args: Array<String>) {
    //this is not a hashmap
    map()
    //flatMap()
}

fun flatMap() {
    val nestedlist = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    println("Nested list is $nestedlist")

}

fun map() {
    val list = (1..10).toList()
    println("My list is $list")

    //maps every element to its respective value of lambda expression
    var doubleValue = list.map { element -> element * 2 }

    //the value is not yet stored 
    list.map { it * 10 }
    println("Doubled value is $doubleValue")
}