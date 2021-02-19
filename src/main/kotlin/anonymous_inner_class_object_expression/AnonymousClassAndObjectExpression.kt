package anonymous_inner_class_object_expression

interface SessionInfoProvider {
    fun print() {
        println("Printing SessionInfoProvider")
    }
}

open class SimpleProvider : SessionInfoProvider {

    open val providerInfo: String
        get() = "Simple Provider"

    override fun print() {
        println("Overriding in concrete class")
    }
}

fun main() {

    //Using object expression to create an anonymous class and add functionality to an existing class
    val simpleProvider = object : SimpleProvider() {
        override val providerInfo: String
            get() = "New Info Provider"

        fun getSimpleProvider(): String {
            return "Property simple provider"
        }
    }


    println(simpleProvider.getSimpleProvider())
    println(simpleProvider.providerInfo)

}