package `4-FunctionalProgramming`

//fun main() {
//    message()
//}
//
//val message = { println("Hello From Lambda") }



//fun main() {
//    printMessage("Hello From Lambda")
//}
//
//val printMessage = { message: String -> println(message) }



fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }



