package OOP

//companion object is used instead of static

interface roomService {
    fun roomService()
}

open class Hotel(val noOfRooms: Int, val price: Int) : roomService {
    //same as static
    companion object {
        val HotelName = "Singh Hotel"
        fun economySuite() = Hotel(100, 1000)
        fun luxoriousSuite() = Hotel(5, 2000)
    }

    override fun roomService() {
        if (noOfRooms <= 10) {
            println("can call room service")
        } else
            println("get a room first")
    }
}

fun main() {
    val myHotel = Hotel.economySuite()
    print("Name: ${Hotel.HotelName} \nNo of Rooms: ${myHotel.noOfRooms} \nPrice: ${myHotel.price}")
    myHotel.roomService()
}