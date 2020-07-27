package assignments

/*
Challenge: Functional Programming for Data Analysis
Challenge: Apply Functional Programming for Simple Data Analysis
We decided to gather data on the age of our users.

In this challenge, you'll be presented with this partly faulty data of user ages
which is based on four input files:

// Some faulty data with ages of our users
val data = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
        )

Apply the functions you learned about as well as
other functions from Kotlin's standard library to solve the following data analysis tasks:

Find the average age of users (use only valid ages for the calculation!)
Extract the names of input files that contain faulty data
Count the total number of faulty entries across all input files


--Hints

map() and flatMap() are often very useful functions for such tasks
Use IntelliJ's autocompletion to explore which other functions,
that were not presented in the lectures, are available (they will drastically simplify the tasks)
*/

fun main(args: Array<String>) {
    val uncleanedData = mapOf(
        "users1.csv" to listOf(32, 45, 17, -1, 34),
        "users2.csv" to listOf(19, -1, 67, 22),
        "users3.csv" to listOf(),
        "users4.csv" to listOf(56, 32, 18, 44)
    )
    println("uncleaned data is $uncleanedData")
    val cleanedData = uncleanedData.flatMap { it.value }.filter { it in 0..100 }.toIntArray()
    println("cleaned data is ${cleanedData.joinToString()}")

    val avgAge = cleanedData.average()
    println("average age: %.2f".format(avgAge))

    //value will give the value of the list i.e[[32, 45, 17, -1, 34], [19, -1, 67, 22]]
    val faultyFiles = uncleanedData.filter { it -> it.value.any { it < 0 } }.map { it.key }
    println("faulty file_names are: $faultyFiles")

    val noOfFaults = uncleanedData.flatMap { it.value }.filter { it < 0 }.count()
    println("number of faults are: $noOfFaults")
}