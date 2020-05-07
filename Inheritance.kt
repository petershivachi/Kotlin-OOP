open class Operation()
{
    fun sum(n1:Int, n2:Int):Int
    {
        var sum = n1 + n2
        return  sum
    }

    fun difference(n1:Int, n2:Int):Int
    {
        var diff = n1 -n2
        return diff
    }

}

class  MultiOperations():Operation()
{
    /*fun sum(n1:Int, n2:Int):Int
    {
        var sum = n1 + n2
        return  sum
    }

    fun difference(n1:Int, n2:Int):Int
    {
        var diff = n1 -n2
        return diff
    }*/

    fun mul(n1:Int, n2:Int):Int
    {
        var mul = n1 * n2
        return  mul
    }

    fun  div(n1:Int, n2:Int):Int
    {
        var div = n1/n2
        return div
    }
}

fun main(args:Array<String>)
{
    var op = Operation()
    var sum = op.sum(23, 24)
    println("Sum :"+sum)
    var diff = op.difference(560, 340)
    println("diff : "+diff)

    var op2 = MultiOperations()
    /*sum = op2.sum(343, 56)
    println("Sum: "+sum)
    diff = op2.difference(678, 245)
    println("diff : "+diff)*/
    var mul = op2.mul(10, 10)
    println("Product: "+mul)
    var div = op2.div(100, 10)
    println("Sum: "+div)
}