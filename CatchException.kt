fun main(args:Array<String>)
{
   /* println("\nEnter a number")
    var num:Int = readLine()!!.toInt()
    var div = 20/num
    println("Div = "+div)*/

    try {
        println("\nEnter a number")
        var num:Int = readLine()!!.toInt()
        var div = 20/num
        println("Div = "+div)
    }catch (ex:Exception)
    {
        println("App done")
    }
}