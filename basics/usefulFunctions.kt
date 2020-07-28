package basics

fun main(args: Array<String>) {
    // let
    let()

    //with
    with()
}

fun with() {
    /*By using it, we can make the code more concise. Let’s see some ordinary code that does not use scoping functions, first:
    class Person {
        var name: String? = null
        var age: Int? = null
    }

    val person: Person = getPerson()
    print(person.name)
    print(person.age)
    The following code snippet is equivalent to the one above, except that it uses with() scoping function to remove repetition of the person variable:
    val person: Person = getPerson()
    with(person) {
        print(name)
        print(age)
    }*/
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