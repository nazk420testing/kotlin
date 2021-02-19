package classes

fun sayHello(greeting: String = "Hello", name: String = "Bob") {
    println("$greeting $name")
}

fun sayHello(greeting: String, listOfStrings: List<String>) {
    for (name in listOfStrings) {
        println("$greeting $name")
    }
}

//varargs
fun sayHelloVarargs(greeting: String, vararg listOfStrings: String?) {
    for (name in listOfStrings) {
        println("$greeting $name")
    }
}

fun main() {
    val listOfNames = mutableListOf("Zaid", "Bob", "Foo")
    sayHello("Hello", listOfNames)

    sayHelloVarargs("Hello")
    sayHelloVarargs("Hello", "Kotline", "", "another", null, "another again")

    val arrayOfNames = arrayOf("Zaid", "Bob", "Foo")
    //sayHelloVarargs("Hello", arrayOfNames)  // Not allowed

    // spreading an array into varargs
    sayHelloVarargs("Hello", *arrayOfNames)  // adding spread operator * to the array name


    // named operator in a function call - order does not matter now
    sayHello(name = "Bob", greeting = "Hello")

    // named argument with default values set in the method
    sayHello() // no arguments passed and defaults will be used

    // named arguments with varargs
    sayHelloVarargs(greeting = "Hi", listOfStrings = *listOfNames.toTypedArray())
    sayHelloVarargs(greeting = "Hi", *listOfNames.toTypedArray())
}

