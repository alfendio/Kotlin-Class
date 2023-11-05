package `3-DataClass`

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}

data class DataUser(val name : String, val age : Int)


