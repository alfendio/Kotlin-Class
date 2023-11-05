package `4-FunctionalProgramming`

//fun main(args: Array<String>) {
//    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val slice = total.slice(3..6)
//
//    println(slice)
//}



//fun main(args: Array<String>) {
//    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val slice = total.slice(3..6 step 2)
//
//    println(slice)
//}



//fun main(args: Array<String>) {
//    val index = listOf(2, 3, 5, 8)
//    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val slice = total.slice(index)
//
//    println(slice)
//}



//data class Item(val key: String, val value: Any)
//
//fun main(args: Array<String>) {
//    val items = listOf(
//        Item("1", "Kotlin"),
//        Item("2", "is"),
//        Item("3", "Awesome"),
//        Item("3", "as"),
//        Item("3", "Programming"),
//        Item("3", "Language")
//    )
//
//    val distinctItems = items.distinctBy { it.key }
//    distinctItems.forEach {
//        println("${it.key} with value ${it.value}")
//    }
//}



//fun main(args: Array<String>) {
//    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
//    val distinct = text.distinctBy {
//        it.length
//    }
//
//    println(distinct)
//}



//fun main(args: Array<String>) {
//    val word = "QWERTY"
//    val chunked = word.chunked(3)
//
//    println(chunked)
//}



fun main(args: Array<String>) {
    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)
}