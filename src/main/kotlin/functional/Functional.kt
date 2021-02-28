package functional

fun main() {
    val list = listOf("Kotlin", "Java", "C++", "Javascript", null, null)
/*
    list
        .filterNotNull()
        .filter { it.startsWith("J", true) }
        .map { it.length }
        .forEach { println(it) }

    */


    list.filterNotNull().take(3).forEach { println(it) }

    list.filterNotNull().takeLast(3).forEach { println(it) }

    list.filterNotNull().takeLast(3).associate { it to it.length }.forEach { println("${it.key} : ${it.value}")}

    val language = list.filterNotNull().findLast { it.startsWith("P") }.orEmpty()
    println(language)


}