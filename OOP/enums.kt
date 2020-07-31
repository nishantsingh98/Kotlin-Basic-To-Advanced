package OOP

/*
An enum is a special "class" that represents a group of constants
(unchangeable variables, like final variables).
*/
enum class Cards(){
    HEARTS,SPADE,CLUB,DIAMOND
}

fun main() {
    val myCard= Cards.HEARTS

    val color = when(myCard){
        Cards.HEARTS,Cards.DIAMOND->"Red"
        Cards.CLUB,Cards.SPADE->"Black"
    }
    println(color)
}