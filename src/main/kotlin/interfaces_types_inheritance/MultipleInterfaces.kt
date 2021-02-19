package interfaces_types_inheritance

interface SessionInfoProvider {
    fun print() {
        println("Printing SessionInfoProvider")
    }
}


interface AnotherBasicInfoProvider {
    fun printIt() {
        println("Printing BasicInfoProvider")
    }
}


abstract class MultipleInterfaces : AnotherBasicInfoProvider, SessionInfoProvider {

}