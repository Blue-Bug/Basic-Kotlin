package basics

fun main(){

    var name = "JAMES";

    val result = if(name.length == 5){
        println("Name is five characters");
        name
    }
    else{
        println("Name is not five characters");
        name
    }

    println(result)

    var rank = 2

    /*val result1 = if(rank == 1){
        "GOLD"
    }
    else if(rank == 2){
        "SILVER"
    }
    else if(rank == 3){
        "BRONZE"
    }
    else{
        "NOTHING"
    }*/

    val result1 = when(rank){
        1-> "GOLD"
        2-> "SILVER"
        3-> "BRONZE"
        else-> "NOTHING"
    }

    println(result1)
}