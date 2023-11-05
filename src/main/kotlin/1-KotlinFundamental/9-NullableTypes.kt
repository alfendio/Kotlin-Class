package `1-KotlinFundamental`

//fun main(args: Array<String>) {
//    val text: String? = null // ready to go
//}


fun main(args: Array<String>) {
    val text: String? = null

    //val textLength = text.length // compile time error

    if (text != null){
        val textLength = text.length // ready to go
    }
}