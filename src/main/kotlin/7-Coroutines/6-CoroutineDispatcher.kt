package `7-Coroutines`

//import kotlinx.coroutines.*
//
//fun main() = runBlocking<Unit> {
//    val dispatcher = newSingleThreadContext("myThread")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}




import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}