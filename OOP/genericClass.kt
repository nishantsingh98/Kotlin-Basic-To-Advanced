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

fun main() {
    val timeLine: Timeline<Int> = Timeline()

    timeLine.addElement(2)
    println(timeLine.latestEvent())
}