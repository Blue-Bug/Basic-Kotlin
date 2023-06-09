package classes

open class User(val name : String){
    open var isLoggedIn : Boolean = false
    open fun login(){
        println("Inside User Login")
    }
}

class Student(name : String) : User(name){
    override var isLoggedIn : Boolean = false
    override fun login(){
        println("Inside Student Login")
        super.login()
    }
}

class Instructor(name : String) : User(name)

fun main(){
    val student = Student("Student")
    println("name is : ${student.name}")
    student.login()
    student.isLoggedIn = true
    println("Logged in values is : ${student.isLoggedIn}")

    val instructor = Instructor("Instructor")
    println("name is : ${instructor.name}")
    instructor.login()
}