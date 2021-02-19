package classes

/*
class Person (firstName:String, lastName: String) {
  /*
    // initialize using an init function
    val firstName: String
    val lastName: String

    init {
        this.firstName = firstName
        this.lastName = lastName
    }

    */

    // initialize and declare together
    val firstName: String = firstName
    val lastName: String = lastName

}

*/

class PersonInitializeWithOneConstructor (val firstName:String, val lastName: String) {

    // No need to initialize as we've done it by defining in constructor
    //val firstName: String = firstName
    // val lastName: String = lastName

}