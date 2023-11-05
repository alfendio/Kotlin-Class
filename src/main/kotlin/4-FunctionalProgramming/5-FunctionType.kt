package `4-FunctionalProgramming`

//typealias Arithmetic = (Int, Int) -> Int
//
//fun main() {
//    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
//
//    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
//}



//typealias Arithmetic = (Int, Int) -> Int
//
//fun main() {
//    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
//
//    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
//
//    val sumResult = sum.invoke(10, 10)
//    val multiplyResult = multiply.invoke(20, 20)
//
//    println(sumResult)
//    println(multiplyResult)
//}



//typealias Arithmetic = (Int, Int) -> Int
//
//fun main() {
//    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
//
//    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
//
//    val sumResult = sum(10, 10)
//    val multiplyResult = multiply(20, 20)
//
//    println(sumResult)
//    println(multiplyResult)
//}



typealias Arithmetic = ((Int, Int) -> Int)?

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val sumResult = sum?.invoke(10, 10)

    println(sumResult)
}