package basics

fun main(args: Array<String>) {
    //LAMBDA FUNCTIONS
    lambda()

    //HIGHER ORDER FUNCTIONS
    higherOrderFunctions()
}

fun lambda() {
    println("LAMBDA FUNCTIONS\n")
    //lambda with single argument and single return type (Int) -> Int
    val timesTwo: (Int) -> Int = { x: Int -> x * 2 } //or  val timesTwo = { x:Int -> x * 2 }
    println("2 * 2 = ${timesTwo(2)}")

    //Lambda with 2 arguments (Int,Int) -> (Int)
    val add: (Int, Int) -> (Int) = { x: Int, y: Int -> x + y }
    println("2 + 2 = ${add(2, 2)}")

}

fun higherOrderFunctions() {
    println("HIGHER ORDER FUNCTIONS\n")
    val list = (1..10).toList()
    println("List before removing odd values = $list")

    val removeOddValues = list.filter { element -> element % 2 == 0 }
    println("List after removing odd values = $removeOddValues")

    //Using it
    println("\nUsing 'it' ")
    val removeEvenValuesUsingIt = list.filter { it % 2 == 0 }
    println("List after removing odd values = $removeEvenValuesUsingIt")

    //here filter() doesn't need '()' as lambda is used in its body list.filter({ it%2!=0 }) is also right
    val removeOddValuesUsingIt = list.filter { it%2!=0 }
    println("List after removing even values = $removeOddValuesUsingIt")

    //calling a function in a function using :: operator
    /*
     :: creates a member reference or a class referenceHere
     ::isEven is a value of function type (Int) -> Boolean
     */

    println("\nCalling a function in an argument ")
    println("Even values of list are ${list.filter(::isEven)}")
    println("Odd values of list are ${list.filter(::isOdd)}")

}

fun isEven(element: Int) = element % 2 == 0
fun isOdd(element: Int) = element % 2 != 0