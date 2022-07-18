fun dataclasses() {
    val (fName, lName, age) = Person("Sayan", "De", 30)
    println("$fName $lName $age")

    val person1 = Person("Dan", "Lee", 20)
    val person2 = person1.copy(age=23)

    println(person1)
    println(person2)
    println(person1 == person2)
}

