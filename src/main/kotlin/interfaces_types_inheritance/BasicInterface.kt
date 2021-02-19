package interfaces_types_inheritance

import classes.Person

interface PersonInfoProvider {
//    fun printInfo(person: Person)

    val providerInfo: String;
    fun printInfo(person: Person) {
        println("${providerInfo}")
        println("${person.firstName} + ${person.lastName}")
    }
}

class BasicInfoProvider : PersonInfoProvider {
    override val providerInfo: String
        get() = "BasicInfoProvider"

    /* override fun printInfo(person: Person) {
         println("Printing BasicInforProvider Person")
         println("${person.firstName} + ${person.lastName}")
     }*/

    override fun printInfo(person: Person) {
        super.printInfo(person)

        println("Printing info in concrete class")
    }
}

fun main() {
    val basicInfoProvider = BasicInfoProvider();
    basicInfoProvider.printInfo(Person());
}