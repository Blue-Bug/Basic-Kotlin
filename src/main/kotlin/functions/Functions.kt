package functions

import java.time.LocalDate

fun main(){
    val unit = printName("TEST")
    println("Unit is $unit")
    val result = addition(1,2)
    println("Result : $result")
    val result1 = addition1(1,2)
    println("Result : $result1")

    printPersonDetails("TEST","TEST@TEST.COM",LocalDate.parse("2023-11-11"))
    printPersonDetails("TEST")
    printPersonDetails(dob = LocalDate.now(),email = "TEST1@TEST.COM",name = "TEST")
    printPersonDetails(dob = LocalDate.now(),name = "TEST")
}

fun addition(x: Int, y: Int): Int {
    return x+y
}
fun addition1(x: Int, y: Int) = x+y

fun printName(name: String) {
    println("Name is $name")
}

fun printPersonDetails(
    name:String,
    email:String = "",
    dob: LocalDate = LocalDate.now()
){
    println("Name is $name and the email is $email and the dob is $dob")
}