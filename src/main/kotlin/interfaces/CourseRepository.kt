package interfaces

import classes.Course

interface Repository {
    fun getAll() : Any
}

interface CourseRepository {
    fun getById(id : Int) : Course
    fun save(course : Course) : Int {
        println("course save : $course")
        return course.id
    }
}

class SqlCourseRepository : CourseRepository, Repository {
    override fun getById(id: Int): Course {
        return Course(id,"Test Course Name", "Test")
    }

    override fun getAll(): Any {
        return 1
    }
}

class NoSqlCourseRepository : CourseRepository {
    override fun getById(id: Int): Course {
        return Course(id,"Test Course Name", "Test")
    }

    override fun save(course: Course): Int {
        println("course save in NoSqlCourseRepository : $course")
        return course.id
    }
}

fun main(){
    val sqlCourseRepository = SqlCourseRepository()
    val course = sqlCourseRepository.getById(1)
    println("Course is $course")

    val courseId1 = sqlCourseRepository.save(Course(5,"Test Course Name", "Test"))
    println("Saved Course Id is $courseId1")

    val noSqlCourseRepository = NoSqlCourseRepository()
    val courseId2 = noSqlCourseRepository.save(Course(6,"Test Course Name", "Test"))
    println("Saved Course Id is $courseId2")
}