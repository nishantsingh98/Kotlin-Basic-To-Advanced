package basics
/*
Challenge: Working will Nullables and If-Expressions

Use the readLine() function to read an input from the command line
Notice the return type of readLine(), and use what you learned to work with it
--The user should input their name
--If the user enters an empty string, store a default value
--Use an if expression to define a different greeting message based on whether the user entered a name

Hints
--First, check readLine() returns null or is a blank string, and assign your default value if so*/

fun main(args: Array<String>) {
    var name: String?
    println("enter your name")
    name = readLine()           //for input from command line
    if (name == "") {
        name = "Bot"
        print("hi $name ")
    } else print("hello $name")
}
