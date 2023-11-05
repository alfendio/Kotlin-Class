package `4-FunctionalProgramming`

//fun main() {
//    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
//    print(fullName)
//}
//
//fun getFullName(first: String, middle: String, last: String): String {
//    return "$first $middle $last"
//}



//fun main() {
//    val fullName = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
//    print(fullName)
//}
//
//fun getFullName(first: String, middle: String, last: String): String {
//    return "$first $middle $last"
//}



//fun getFullName(
//    first: String = "Kotlin",
//    middle: String = " is ",
//    last: String = "Awesome"): String {
//    return "$first $middle $last"
//}
//
//fun main() {
//    val fullName = getFullName()
//    print(fullName)
//}



fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val fullName = getFullName(first = "Dicoding")
    print(fullName)
}




