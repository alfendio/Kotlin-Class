package `4-FunctionalProgramming`

//fun sumNumbers(vararg number: Int): Int {
//    return number.sum()
//}
//
//fun main() {
//    val number = sumNumbers(10, 20, 30, 40)
//    print(number)
//}



fun main() {
    val number = getNumberSize(10, 20, 30, 40, 50)
    print(number)
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}



