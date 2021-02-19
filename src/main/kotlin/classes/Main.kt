package classes

fun main() {

    // simple person class with one constructor
    val person = PersonInitializeWithOneConstructor("Bob", "Builder");
    person.firstName
    person.lastName


    // multiple constructors
    val personMultipleConstructors = PersonMultipleConstructors();

    // immutable and mutable i.e. getter only vs getter and setter both
    val personImmutableProperties = PersonImmutableProperties();
    personImmutableProperties.lastName = "Builder"
    println(personImmutableProperties)
}