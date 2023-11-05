package `5-ObjectOrientedProgramming`

///*class Animal(private var name: String) {
//    fun eat() {
//        println("$name makan!")
//    }
//
//    fun eat(typeFood: String) {
//        println("$name memakan $typeFood!")
//    }
//
//    fun eat(typeFood: String, quantity: Double) {
//        println("$name memakan $typeFood sebanyak $quantity grams!")
//    }
//
//    fun sleep() {
//        println("$name tidur!")
//    }
//}
//
//
//fun main() {
//    val dicodingCat = Animal("Dicoding Miaw")
//
//    dicodingCat.eat()
//    dicodingCat.eat("Ikan Tuna")
//    dicodingCat.eat("Ikan Tuna", 450.0)
//}*/

/*
    Output:
    Dicoding Miaw makan!
    Dicoding Miaw memakan Ikan Tuna!
    Dicoding Miaw memakan Ikan Tuna sebanyak 450.0 grams!
*/




class Calculator {
    fun add(value1: Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add(value1: Double, value2: Double) = value1 + value2
    fun add(value1: Float, value2: Float) = value1 + value2

    fun min(value1: Int, value2: Int) = if (value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if (value1 < value2) value1 else value2
}


fun main() {
    val calc = Calculator()

    println(calc.add(2, 4))
    println(calc.add(2.5, 2.2))
    println(calc.add(6f, 7f))
    println(calc.add(1, 2, 3))

    println(calc.min(9, 2))
    println(calc.min(17.2, 18.3))
}

/*
output
    6
    4.7
    13.0
    6
    2
    17.2
*/