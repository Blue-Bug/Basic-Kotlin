package classes

data class Course(
    val id : Int,
    val name : String,
    val author : String
)

fun main(){
    val course = Course(1,"Test Course Name", "Test")
    println(course)

    val course1 = Course(2,"Test Course Name", "Test")
    println("Check Equality : ${course == course1}")

    val course2 = course1.copy(
        id = 3,author = "Test2"
    )
    println(course2)
}