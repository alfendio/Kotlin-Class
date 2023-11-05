package `5-ObjectOrientedProgramming`

//fun main() {
//    val someValue = 6
//    println(someValue / 0)
//}



//fun main() {
//    val someStringValue = "18.0"
//    println(someStringValue.toInt())
//}



fun main() {
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)
}

/*
output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
*/
