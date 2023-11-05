package `5-ObjectOrientedProgramming`

//fun main() {
//    val someString = "Dicoding"
//    println(someString.reversed())
//    println(someString.uppercase())
//    println(someString.lowercase())
//}



fun main() {
    val someString = "123"
    val someInt = someString.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
}



