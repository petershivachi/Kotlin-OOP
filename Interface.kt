interface op
{
    fun sum(n1:Int, n2:Int);
    fun sub(n1:Int, n2:Int);
    fun mul(n1:Int, n2:Int);
    fun div(n1:Int, n2:Int);
}

class UserOp:op
{
    override fun sum(n1: Int, n2: Int) {
        println(n1 + n2)
    }

    override fun sub(n1: Int, n2: Int) {
        println(n1 - n2)
    }

    override fun mul(n1: Int, n2: Int) {
        println(n1 * n2)
    }

    override fun div(n1: Int, n2: Int) {
        println(n1/n2)
    }

}

fun main(args:Array<String>)
{
    var new = UserOp()
    var sum = new.sum(45, 65)
    println("Sum : "+sum)
    var sub = new.sub(560,380)
    println("Difference : "+sub)
    var mul = new.mul(56, 50)
    println("Product : "+mul)
    var div = new.div(2600, 20)
    println("Division : "+div)
}