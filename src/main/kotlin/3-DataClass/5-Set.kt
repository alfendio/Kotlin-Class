package `3-DataClass`

//fun main(args: Array<String>) {
//    val integerSet = setOf(1, 2, 4, 2, 1, 5)
//
//    println(integerSet)
//}


//fun main(args: Array<String>) {
//    val setA = setOf(1, 2, 4, 2, 1, 5)
//    val setB = setOf(1, 2, 4, 5)
//
//    println(setA == setB)
//}


//fun main(args: Array<String>) {
//    val setA = setOf(1, 2, 4, 2, 1, 5)
//
//    print(5 in setA)
//}


fun main(args: Array<String>) {
    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(union)
    println(intersect)
}