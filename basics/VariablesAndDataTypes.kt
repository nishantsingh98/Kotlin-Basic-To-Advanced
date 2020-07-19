package basics

fun main(args: Array<String>) {
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
        println("i is smaller than 10 as i=${i}")
        10.00
    } else {
        println("i is bigger than 10")
        "big"
    }
    /*
    O/Pi is smaller than 10 as i=1
    x
    res16: kotlin.Any = 10.0
    */
    loops()
    collections()
}

fun loops() {
    for (i in 1..10)
        println("i = ${i} ")
//FOR LOOP
    val a = arrayOf(1, 2, 3, 4)
    println("-----FOR LOOP-----")
    for (i in a.indices) {
        println("value of array at position ${i} = " + a[i])
    }

//WHILE LOOP
    var i = 1
    println("-----WHILE LOOP-----")
    while (i < 10) {
        println("i = ${i}")
        i++
    }

//DO WHILE
    var x = 0
    println("-----DO WHILE LOOP-----")
    do {
        println("value of x = ${x} ")
        x++
    } while (x < 10)
}

fun collections() {
//ARRAY
    val a = arrayOf(1, 2, 3, 4)
    println("-----Array-----")
    for (i in a.indices) {
        println("array element at index ${i} = ${a[i]}\n")
    }
//LIST
    println("-----List-----")
    val immutableList = listOf(1, 2, 3)
    //immutableList.add() cant be used here as its only read
    println("immutableList value at index 0 = " + immutableList.get(0) + "\n")
    println("immutable list $immutableList\n")

    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(3)
    mutableList.remove(0)
    println("mutable list $mutableList\n")
//SET
    println("-----Set-----")
    val immutableSet = setOf(1, 2, 3, 3)
    print("immutable set $immutableSet\n")

    val mutableSet = mutableSetOf(1, 2, 3, 3)
    print("mutable set = $mutableSet\n")
    mutableSet.add(4)
    print("mutable set after adding an element $mutableSet\n")
}