package classes

class Person(
    val name : String = "",
    val age : Int = 0
) {
    var email : String = ""
    var nameLength : Int = 0

    init{
        println("Inside Init Block")
        nameLength = name.length
    }

    constructor(
        _email : String,
        _name : String = "",
        _age : Int = 0
    ) : this(_name,_age){
        email = _email
    }

    fun action(){
        println("Person walks")
    }
}

fun main() {
    val person = Person()
    println("Person name is ${person.name} and age is ${person.age}")
    person.action()

    val person1 = Person("TEST", 20)
    println("Person name is ${person1.name} and age is ${person1.age}")

    val person2 = Person(_email="TEST@TEST.com",_name="TEST",_age = 20)
    println("Person name is ${person2.name} and age is ${person2.age} and email is ${person2.email}" +
            " and nameLength is ${person2.nameLength}")
}