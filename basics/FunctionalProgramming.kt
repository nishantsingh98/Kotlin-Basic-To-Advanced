package basics

fun main(args: Array<String>) {
    //LAMBDA FUNCTIONS
    lambda()

    //HIGHER ORDER FUNCTIONS
    higherOrderFunctions()
}

fun lambda() {
    //lambda with single argument and single return type (Int) -> Int
    val timesTwo: (Int) -> Int = { x: Int -> x * 2 } //or  val timesTwo = { x:Int -> x * 2 }
    println(timesTwo(4))

    //Lambda with 2 arguments (Int,Int) -> (Int)
    val add: (Int,Int) -> (Int) = { x: Int, y: Int -> x + y }
}

fun higherOrderFunctions() {

}
