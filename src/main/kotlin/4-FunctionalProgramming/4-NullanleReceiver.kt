package `4-FunctionalProgramming`

//fun main() {
//    val value: Int? = null
//
//    println(value.slice)
//}
//
//val Int?.slice: Int
//    get() = this?.div(2) ?: 0



//fun main() {
//    val value: Int? = null
//    val value1: Int? = null
//
//    println(value?.slice)
//    println(value1?.slice)
//}
//
//val Int.slice: Int
//    get() = this.div(2)



fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value.slice)
    println(value1.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0




