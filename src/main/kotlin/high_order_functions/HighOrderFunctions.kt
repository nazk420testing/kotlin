package high_order_functions

//method taking a lambda function
fun printFilterStrings(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if (predicate(it)) {
            println("Predicate is TRUE for item: $it")
        } else {
            println("Predicate is FALSE for item: $it"); }
    }
}

//method taking a lambda function that can be null
// 1 - lambda is surrounded by ()? // to accept a null
// 2 - predicate(it) now changes to predicate?.invoke(it) == true
fun printFilterStringsNullable(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println("Predicate is TRUE for item: $it")
        } else {
            println("Predicate is FALSE for item: $it"); }
    }
}

// a variable of functional type
val predicate: (String) -> Boolean = {
    it.startsWith("t")
}

// function returning a function
// fun NAME(PARAMS) : RETURN_Type
// in this case the return is a function that takes a STRING i.e. (String) ->
// and return a Boolean
// now inside the lambda function body we can provide the predicate that will work on the param String and return boolean
fun getPredicateFunction(): (String) -> Boolean {
    return { it.startsWith("N") }
}

fun main() {

    // this is a valid call but it is preferred to provide lambda outside of the parenthesis as done below
    //     printFilterStrings(listOf("Name", "123", "this", "true"), {it.startsWith("N")})

    // call the high order function that takes a function which we have provided as a lambda
    // NOTE: if the last argument to a method is a Lambda then we provide it outside of the parameters closing brackets.z
    printFilterStrings(listOf("Name", "123", "this", "true")) { it.startsWith("N") }

    print(System.lineSeparator())
    printFilterStringsNullable(listOf("Name", "123", "this", "true")) { it.startsWith("N") }

    print(System.lineSeparator())
    printFilterStringsNullable(listOf("Name", "123", "this", "true"), null)


    //using the variable function
    print(System.lineSeparator())
    printFilterStringsNullable(listOf("Name", "123", "this", "true"), predicate)

    //using a function that returns a function
    print(System.lineSeparator())
    printFilterStringsNullable(listOf("Name", "123", "this", "true"), getPredicateFunction())


}