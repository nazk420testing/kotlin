
// top-level variable
val topLevelVariable: String = "Hello Top Variable";
val topLevelVariableTwo = null;


// nullable String by adding ? to the type.
val nullableString: String? = null;

fun main() {
    // read-only variable
    val nameReadOnly: String = "Hello";
    var nameVariable: String = "Hello";
    nameVariable = nameVariable + " World!";

    print(nameVariable)
}

