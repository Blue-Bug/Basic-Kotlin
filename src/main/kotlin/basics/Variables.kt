package basics

import functions.courseName
import functions.topLevelFunction

fun main(){
    val name : String = "Test";

    println(name);

    var age = 112;
    println(age);
    age = 1;
    println(age);

    val salary = 30000L;
    println(salary);

    val course = "Kotlin Spring";

    println("Course : $course and length ${course.length}");

    val multiline = "ABC \n DEF";
    println(multiline);
    val multiline1 = """
            ABC
            DEF
    """.trimIndent();
    println(multiline1);

    //top-level functions and properties
    println("topLevelFunction = ${topLevelFunction()}")
    println("courseName = $courseName")
}