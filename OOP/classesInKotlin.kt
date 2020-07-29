package OOP

//data members are usually passed as arguments
class Student(val name: String, val rollNo: Long) {
    //member function
    fun print() = "name:$name, rollno:$rollNo"
}

fun main(args: Array<String>) {
    // no new keyword in creating object
    val obj = Student("Nishant", 132)
    println(obj.print())
}
