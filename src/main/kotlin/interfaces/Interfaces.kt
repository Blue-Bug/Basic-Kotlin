package interfaces


interface A {
    fun doSomething() {
        println("doSomething in A")
    }
}

interface B{
    fun doSomething() {
        println("doSomething in B")
    }
}

class AB : A, B{
    override fun doSomething() {
        super<A>.doSomething()
        super<B>.doSomething()
        println("doSomething in AB")
    }
}

fun main(){
    val ab = AB()
    ab.doSomething()
}