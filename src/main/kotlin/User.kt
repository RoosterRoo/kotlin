class User(firstName: String, lastName: String) {
    init {
        println("$firstName $lastName")
    }
    var fullName: String = "$firstName $lastName"
        get() = "Name: $field"
        set(value) {
            if (value == "") {
                field = "Anonymous"
            } else {
                field = value
            }
        }

    companion object {
        fun getPattern() {
            for (i in 1..4) {
                for (j in 1..i) {
                    print(j)
                }
                println()
            }
        }
    }

}