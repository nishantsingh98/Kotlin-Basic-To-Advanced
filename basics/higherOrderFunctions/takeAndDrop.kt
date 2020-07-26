package basics.higherOrderFunctions

fun main(args: Array<String>) {
    //take and drop
    take()
    drop()
}

fun take() {
    val list = (1..10).toList()

    //takes the first n elements from the list
    println("Taking first 3 elements and the elements are ${list.take(3)}")
}

fun drop() {
    val list = (1..10).toList()

    //drops the first n elements and gives the rest
    println("Dropping first 3 elements and rest are ${list.drop(3)}")
}