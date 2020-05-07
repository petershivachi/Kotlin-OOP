class Template<T>(credit : T)
{
    init {
        println(credit)
    }
}

fun <T> display(process:T)
{
    display(process)
}

fun main(args:Array<String>)
{
    var template = Template<String>("Peter Shitsukane")
    var template1 = Template<Int>(8438)
    var template3 = Template<Double>(23489.00)

    display<String>("PillowGames")
    display<Int>(8976)
}