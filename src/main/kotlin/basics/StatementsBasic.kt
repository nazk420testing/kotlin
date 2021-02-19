// top-level variable
val nullable: String? = null;

fun main() {

    //if - else
    if (nullable.isNullOrBlank()) {
        println("Null or Blank")
    } else {
        println("Not null or Blank")
    }

    // when
    when (nullable) {
        null -> println("null")
        else -> println("not null")
    }

    val greetingToPrint = if (nullable.isNullOrBlank()) "Hello New" else nullable
    println(greetingToPrint)

    val newGreeting: String? = "";

    val returned = when(newGreeting) {
        null -> "Turned null to this"
        else -> newGreeting
    }

    println(returned)
}

