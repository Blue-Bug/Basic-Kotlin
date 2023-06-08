package classes

class Item {
    var name : String = ""

    constructor(_name : String) {
        name = _name
    }
}

fun main(){
    var item = Item("TEST")
    println("Item name is ${item.name}")
    item.name = "TEST2"
    println("Item name is ${item.name}")

}