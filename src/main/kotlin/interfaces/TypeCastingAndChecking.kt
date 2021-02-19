package interfaces

interface PersonTypePrinter {
    fun printPersonTypePrinter() { println("A PersonTypePrinter ") }
}
interface SuperPersonTypePrinter {
    fun printSuperPersonTypePrinter() { println("A SuperPersonTypePrinter ")  }
}
class BasicPersonType : PersonTypePrinter, SuperPersonTypePrinter

fun main() {
    val basicPerson = BasicPersonType()
    //Type checking
    if (basicPerson is SuperPersonTypePrinter) { println("A basic person") }
    if (basicPerson !is SuperPersonTypePrinter) { println("Not a super person") }

    // Type casting
    (basicPerson as SuperPersonTypePrinter).printSuperPersonTypePrinter()
    (basicPerson as PersonTypePrinter).printPersonTypePrinter()

    // smart type case by compiler
    basicPerson.printPersonTypePrinter()
}