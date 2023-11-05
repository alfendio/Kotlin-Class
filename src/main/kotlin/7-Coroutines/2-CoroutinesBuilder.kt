package `7-Coroutines`

//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//    val capital = getCapital()
//    val income = getIncome()
//    println("Your profit is ${income - capital}")
//}
//
//
//suspend fun getCapital(): Int {
//    delay(1000L)
//    return 50000
//}
//
//suspend fun getIncome(): Int {
//    delay(1000L)
//    return 75000
//}



//import kotlinx.coroutines.*
//
//fun main() = runBlocking {
//    val capital = async { getCapital() }
//    val income = async { getIncome() }
//    println("Your profit is ${income.await() - capital.await()}")
//}
//
//
//suspend fun getCapital(): Int {
//    delay(1000L)
//    return 50000
//}
//
//suspend fun getIncome(): Int {
//    delay(1000L)
//    return 75000
//}



import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    val timeOne = measureTimeMillis {
        val capital = getCapital()
        val income = getIncome()
        println("Your profit is ${income - capital}")
    }

    val timeTwo = measureTimeMillis {
        val capital = async { getCapital() }
        val income = async { getIncome() }
        println("Your profit is ${income.await() - capital.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")

}


suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}



