package basics

import java.util.function.BiConsumer

fun main() {

    // ARRAYS    ---------------------------------------
    /*

    //array are fixed sized structure i.e immutable. Values can change
    val anArrayOfThings = arrayOf("Kotlin", "Programming", "Books")

    //immutable array

    println(anArrayOfThings.size)
    println(anArrayOfThings[0])
    println(anArrayOfThings.get(0))

    //simple for-each
    anArrayOfThings.forEach { s: String -> println(s) }

    //foreach with index
    anArrayOfThings.forEachIndexed() { index, anElement -> println("The element: $anElement is at index: $index") }

     */


    // LISTS  ------------------- mutable or immutable (default)--------------------
    /*
    val aMutableList = mutableListOf("Kotlin", "Programming", "Books")
    val aList = listOf("Kotlin", "Programming", "Books")
    for (element in aList) {
        println(element)
    }
    aList.forEach {item: String ->   println(item)}
    aList.forEachIndexed { index, anElement ->  println("The element: $anElement is at index: $index") }

    */
    // LISTS  -------------immutable (default) or mutableMap-------------------------

    val aMap = mapOf(1 to "Kotlin", 2 to "Programming", 3 to "Book")
//    aMap.put  -- not possible as this is immutable map by default

    aMap.forEach { entry ->  println("${entry.key}: ${entry.value} ")}
    println(System.lineSeparator())
    aMap.forEach { (key,value) ->  println("${key}: ${value} ")}

    val aMutableMap = mutableMapOf(1 to "Kotlin", 2 to "Programming", 3 to "Book")
    aMutableMap.putIfAbsent(4,"nice") // should be able to put as key does not exist
    println(System.lineSeparator())
    aMutableMap.forEach { (key,value) ->  println("${key}: ${value} ")}

    aMutableMap.putIfAbsent(4,"changing nice if absent") // should not change anything as key exists
    println(System.lineSeparator())
    aMutableMap.forEach { (key,value) ->  println("${key}: ${value} ")}



}

class CollectionsBasics {

}