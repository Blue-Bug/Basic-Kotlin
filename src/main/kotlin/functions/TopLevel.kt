package functions

const val courseName = "Kotlin Programming"

fun topLevelFunction() : Int {
    return (0 .. 100).random()
}

fun main(){
    val result = topLevelFunction()
    println("Result is $result")
}