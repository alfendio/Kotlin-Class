fun main() {
    val user = setUser("Alfend", 22)
    println(user)

    printUser("Alfend")
}

/*
    output :
    Your name is Alfend, and you 22 years old
    Your name is Alfend
*/

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}