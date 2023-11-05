package `3-DataClass`

//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val evenList = numberList.filter { it % 2 == 0 }
//
//    println(evenList)
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val notEvenList = numberList.filterNot { it % 2 == 0 }
//
//    println(notEvenList)
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val multipliedBy5 = numberList.map { it * 5 }
//
//    println(multipliedBy5)
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    print(numberList.count())
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    print(numberList.count { it % 3 == 0 })
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val firstOddNumber = numberList.find { it % 2 == 1 }
//    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
//
//    println("firstOddNumber: $firstOddNumber")
//    println("firstOrNullNumber: $firstOrNullNumber")
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val moreThan10 = numberList.first { it > 10 }
//    print(moreThan10)
//}


//fun main(args: Array<String>) {
//    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    val total = numberList.sum()
//
//    println(total)
//}


//fun main(args: Array<String>) {
//    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
//    val ascendingSort = kotlinChar.sorted()
//    println(ascendingSort)
//}


fun main(args: Array<String>) {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)

    // descendingSort: [t, o, n, l, k, i]
}