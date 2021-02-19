package classes


class PersonMultipleConstructors (val firstName:String, val lastName: String) {

    init {
        println("Init 1")
    }
    //secondary construction
    constructor() : this("Bob","Builder") {
        println("Secondary constructor")
    }

    init {
        println("Init 2")

    }
}