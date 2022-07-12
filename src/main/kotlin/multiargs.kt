fun multiargs(name: String, vararg food: String) {
    println("Name: $name, Food: \n")
    food.forEach { println(it) }
}