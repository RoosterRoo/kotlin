fun interpolation() {
    var hello: String = """
        Hello,
        I am Sayan,
        Nice to meet you!!
    """
    println(hello)
    hello = """
        Hello,
        I am Sayan,
        Nice to meet you!!
    """.trimIndent()
    println(hello)
    val name = "Sayan"
    println("Hello $name")
}