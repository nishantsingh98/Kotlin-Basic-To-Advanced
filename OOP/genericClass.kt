package OOP

import java.util.*

class Timeline<E> {
    val date2Data: MutableMap<Date, E> = mutableMapOf()

    fun addElement(newElement: E) {
        date2Data.put(Date(), newElement)
    }

    fun latestEvent(): E {
        return date2Data.values.last()
    }
}

//generic function
fun <E> timelineOf(vararg elements: E): Timeline<E> {
    val result = Timeline<E>()
    for (element in elements) {
        result.addElement(element)
        println("added element $element")
    }
    return result
}


fun main() {
    val timeLine: Timeline<Int> = Timeline()

    timeLine.addElement(2)
    println(timeLine.latestEvent())

    val timeline2= timelineOf(3,4.5,"...")
}