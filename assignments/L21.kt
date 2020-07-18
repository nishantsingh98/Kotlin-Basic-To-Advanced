package basics
/*
Challenge: Using Collections and Loops

--Create a collection of integers
--Use java.util.Random to fill the collection with 100 random numbers between 1 and 100.
--Go through the collection from start to end and print its elements
 up to the point where an element is less than or equal to 10

 NOTE: Do it without using “if” or “when”
*/

import java.util.*

fun main(args: Array<String>) {
    val random: MutableList<Int> = mutableListOf()
    for (i in 1..100) {
        random.add(Random().nextInt(100) + 1)
    }

    var i = 0
    println("the size of random is ${random.size}")
    while (i < random.size && random[i] > 10) {
        println(random[i])
        i++
    }


}