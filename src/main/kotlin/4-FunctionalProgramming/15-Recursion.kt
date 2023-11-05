package `4-FunctionalProgramming`

//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        var result = 1
//        for (i in 1..n) {
//            result *= i
//        }
//        result
//    }
//}



//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        n * factorial(n - 1)
//    }
//}



//fun main() {
//    println("Factorial 9999 is: ${factorial(9999)}")
//}


//fun factorial(n: Int): Int {
//    return if (n == 1) {
//        n
//    } else {
//        n * factorial(n - 1)
//    }
//}



//fun factorial(n: Int, result: Int = 1): Int {
//    val newResult = n * result
//    return if (n == 1) {
//        newResult
//    } else {
//        factorial(n - 1, newResult)
//    }
//}



tailrec fun factorial(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial(n - 1, newResult)
    }
}



