package basics

fun main(args: String) {
    //
    val a: Int = 10
    /*
    a=20
    error: val cannot be reassigned
    */

    val name: String = "Nishant" // = val name = "Nishant"for type safety
    /*
    Expressions-
    1. if expression
    */

    val i = 10

    val x = if (i < 10) {
        print("i is smaller than 10 as i=${i}")
        10.00
    } else {
        print("i is bigger than 10")
        "big"
    }
    /*
    O/Pi is smaller than 10 as i=1
    x
    res16: kotlin.Any = 10.0
    */
}

fun loops() {

}

fun collections() {
//ARRAY
    val a = arrayOf(1, 2, 3, 4)
    for (i in a.indices) {
        print(a[i])
    }
//LIST
    val immutableList = listOf(1, 2, 3)
    //immutableList.add() cant be used here as its only read
    immutableList.get(0)
    print("immutable list $immutableList")

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(3)
    mutableList.remove(0)
    print("mutable list $mutableList")
//SET
    val immutableSet= setOf(1,2,3,3)
    print("immutable set $immutableSet")

    val mutableSet = mutableSetOf(1,2,3,3)
    mutableSet.add(4)
    print("mutable set $mutableSet")

}