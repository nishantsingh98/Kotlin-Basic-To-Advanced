package basics

fun main(args: Array<String>) {
    //this is not a hashmap
    map()
    flatMap()
}

fun flatMap() {
    val nestedlist = listOf(
        (1..10).toList(),
        (11..20).toList(),
        (21..30).toList()
    )

    println("Nested list is $nestedlist")

    // this sorts every individual list in the descending order
    println("Not flattened list ${nestedlist.map { it.sortedDescending() }}")

    //flatmap creates a single list from the nested list
    println("Flattened list ${nestedlist.flatMap { it.sortedDescending() }}")

}

fun map() {
    val list = (1..10).toList()
    println("My list is $list")

    //maps every element to its respective value of lambda expression
    var doubleValue = list.map { element -> element * 2 }
    println("Doubled value is $doubleValue")

    //the value is not yet stored
    list.map { it * 10 }

    //to store the value
    val tenTimes = list.map { it * 10 }
    println("Ten times value is $tenTimes")

    //to sort the list
    println("the sorted list in descending is ${list.sortedDescending()}\nAverage is ${list.average()}")
    println("List - Average =  ${list.map { it - list.average() }}")
}