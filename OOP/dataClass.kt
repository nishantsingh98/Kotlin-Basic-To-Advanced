package OOP

//generates copy(), toString(), hashCode(), equals(), destructuring operator implicitly
data class Address(val blockNo: Char, val houseNo: Int, val ownerName: String)

fun main() {
    val residence = Address('G', 204, "Nishant")
    val residence2 = Address('G', 204, "Nishant")

    //toString()
    println(residence)

    //hashCode() is used to compare the address/reference of the object
    println("is the address of residence and residence2 the same ? ${residence === residence2}")
    println("is the value of residence and residence2 the same ? ${residence == residence2}")

    //copy()
    val neighbour = residence.copy(houseNo = 205)
    neighbour.toString()

    //destructuring
    residence.component1()
    val (block, houseNo) = residence
    println("block:$block, houseNo:$houseNo ")
}