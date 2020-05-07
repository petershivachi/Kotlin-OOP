open class Operation1()
{
    open fun sum(n1:Int, n2:Int):Int
    {
        var sum = n1 + n2
        return sum
    }

    fun diff(n1:Int, n2:Int):Int
    {
        var diff = n1 - n2
        return diff
    }

class MultiOperation1 :Operation1()
{
    /*constructor():super(){

    } */

    override fun sum(n1:Int, n2:Int):Int
     {
        //var sum = (n1 + n2)*3
        //return sum
          return (n1 + n2)*3
    }

    fun mul(n1:Int, n2:Int):Int
    {
        var mul = n1 * n2
        return mul
    }

    fun div(n1:Int, n2:Int):Int
    {
        var div = n1/n2
        return div
    }

fun main(args:Array<String>)
{
    var opp = Operation1()
    var sum = opp.sum(34, 56)
    println("\nSum : "+sum)
    var diff = opp.diff(58, 24)
    println("\nDiff : "+sum)

    var opp1 = MultiOperation1()
    opp.sum(45, 65)
    println("Sum : "+sum)
    opp.diff(546, 328)
    println("Diff : "+diff)
    var mul = opp1.mul(34, 50)
    println("Mul : "+mul)
    var div = opp1.div(568, 7)
    println("Div : "+div)

    //Second
    var opp2 = MultiOperation1()
    opp2.sum(5, 3)
    println("Sum : "+sum)

}
}
}