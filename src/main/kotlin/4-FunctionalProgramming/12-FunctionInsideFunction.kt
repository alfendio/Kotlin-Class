package `4-FunctionalProgramming`

//fun setWord(message: String) {
//    fun printMessage(text: String) {
//        println(text)
//    }
//
//    printMessage(message)
//}



//fun setWord(message: String) {
//    fun printMessage(text: String) {
//        println(text)
//    }
//
//    printMessage(message)
//}



//fun setWord(message: String) {
//    fun printMessage() {
//        println(message)
//    }
//
//    printMessage()
//}



//fun setWord(message: String) {
//    printMessage() // ERROR: Unresolved references
//
//    fun printMessage() {
//        println(message)
//    }
//
//    printMessage()
//}



//fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    if (valueA == 0) {
//        throw IllegalArgumentException("valueA must be better than 0")
//    }
//
//    if (valueB == 0) {
//        throw IllegalArgumentException("valueB must be better than 0")
//    }
//
//    if (valueC == 0) {
//        throw IllegalArgumentException("valueC must be better than 0")
//    }
//
//    return valueA + valueB + valueC
//}



//fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//    fun validateNumber(value: Int) {
//        if (value == 0) {
//            throw IllegalArgumentException("value must be better than 0")
//        }
//    }
//
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueC)
//
//    return valueA + valueB + valueC
//}



fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber(){
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}