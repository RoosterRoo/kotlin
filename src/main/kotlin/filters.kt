fun filters() {
    val names = mutableListOf<String>("Dan", "John", "Raul")
    val others = listOf<String>("Sam", "Mike")

    others.filterTo(names) { it.contains("a") }
    println(names)

    val more = listOf<String>("Amber", "Penny")
    more.filterNotTo(names) { it.contains("y") }
    println(names)
}