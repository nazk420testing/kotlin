package basics

fun main() {
    var nickname: String? = null;
    println("The nickname is: ${nickname ?: "No nickname"}")
    nickname = "Changed nickname"

    println("The nickname is: ${nickname ?: "No nickname"}")
}