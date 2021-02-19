
fun main() {
    println(getGreeting());
    println(hello())
    println(getGreetingShort())
    println(getNullString())

    sayHello("Kotlin")
    sayHello("Kotlin", "Hello")
}

fun getGreeting(): String {
    return "Returned String"
}

// returns nothing
fun hello() : Unit {
    return Unit;
}

// type inference
fun getGreetingShort() : String = "String returned"
fun getNullString() : String? = null

// params
fun sayHello(name: String) =  println("Hello $name")
fun sayHello(name: String, hello: String) =  println("Hello $name $hello")

