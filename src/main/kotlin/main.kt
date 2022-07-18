fun main() {
    println("HEllo")

    variables()

    readonly()

    types()

    values()

    interpolation()

    strings()

    multiargs(name = "Sayan", "Burger", "Pizza", "Shawarma")

    var user = User("Sayan", "De")
    println(user)
    println(User.getPattern())
    println(user.fullName)
    user.fullName = ""
    println(user.fullName)

    dataclasses()

    pairs()

    filters()
}