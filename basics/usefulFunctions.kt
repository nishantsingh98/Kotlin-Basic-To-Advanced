package basics

fun main(args: Array<String>) {
    // let
    let()
}

fun let() {
    /*
    inline fun <T, R> T.let(block: (T) -> R): R
    Calls the specified function block with this value as its argument and returns its result.
    */

    val str: String? = "ABCDEFG"
    str?.let {
        println(" my string is $str now lowercase: ${str.toLowerCase()}")
        val a = 10
    }
    /*
    this will give error
    as a is used in let block and its life is valid in the let block only
    */
    //println(a)
}