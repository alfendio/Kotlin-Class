package `3-DataClass`

//fun main(args: Array<String>) {
//    val capital = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "England",
//        "New Delhi" to "India"
//    )
//    println(capital["Jakarta"])
//}


//fun main(args: Array<String>) {
//    val capital = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "England",
//        "New Delhi" to "India"
//    )
//    println(capital.getValue("Jakarta"))
//}


//fun main(args: Array<String>) {
//    val capital = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "England",
//        "New Delhi" to "India"
//    )
//    println(capital["Amsterdam"])
//    println(capital.getValue("Amsterdam"))
//}


//fun main(args: Array<String>) {
//    val capital = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "England",
//        "New Delhi" to "India"
//    )
//    println(capital["Amsterdam"])
//    println(capital.getValue("Amsterdam"))
//}


//fun main(args: Array<String>) {
//    val capital = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "England",
//        "New Delhi" to "India"
//    )
//    val mapKeys = capital.keys
//    // mapKeys: [Jakarta, London, New Delhi]
//    println(mapKeys)
//}


//fun main(args: Array<String>) {
//    val capital = mapOf(
//        "Jakarta" to "Indonesia",
//        "London" to "England",
//        "New Delhi" to "India"
//    )
//    val mapValues = capital.values
//    // mapValues: [Indonesia, England, India]
//    println(mapValues)
//}


fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
}



