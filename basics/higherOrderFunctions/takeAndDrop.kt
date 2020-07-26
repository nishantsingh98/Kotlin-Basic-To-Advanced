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

    //generates an infinite seq but it is not generated till we use take or drop
    val infiniteListOfNumbers = generateSequence(0) {
        print("curr $it ")
        it + 1
    }
    println("the first 10 elements are: \n ${infiniteListOfNumbers.take(10).toList()}")
}

fun drop() {
    val list = (1..10).toList()

    //drops the first n elements and gives the rest
    println("Dropping first 3 elements and rest are ${list.drop(3)}")
}