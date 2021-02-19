package classes

class PersonImmutableProperties(val firstName: String = "Bob") {

    var lastName: String? = null; set(value) { field = value;
        println("The new lastName is $value")
    }

    override fun toString(): String {
        return "$firstName $lastName"
    }

}