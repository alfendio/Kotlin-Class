// String
//fun main() {
//    val text  = "Kotlin"
//    val firstChar = text[0]
//
//    print("First character of $text is $firstChar")
//}

/*
  output : First character of Kotlin is K
*/


// Escaped String
//fun main() {
//    val name = "Unicode test: \u00A9"
//    print(name)
//}

/*
   output: Unicode test : ©
*/


// Raw String
fun main() {
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
}

/*
    output:
        Line 1
        Line 2
        Line 3
        Line 4
 */
