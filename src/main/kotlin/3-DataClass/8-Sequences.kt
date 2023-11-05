package `3-DataClass`

//fun main() {
//    val list = (1..1000000).toList()
//    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
//}


//fun main() {
//    val list = (1..1000000).toList()
//    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
//}


fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}
// Output: 1 2 3 4 5