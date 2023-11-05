package `5-ObjectOrientedProgramming`

//fun main(){
//    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//}
//
//class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)




//fun main(){
//    val dicodingCat = Animal("Dicoding Miaw", 4.2)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//}
//
///*
// output:
//    Nama: Dicoding Miaw, Berat: 4.2, Umur: 0, mamalia: true
//*/
//
//class Animal(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)




fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

/*
output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
*/

class Animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}