class Singleton
{
    var name:String? = null
    private constructor()
    {
        println("\nA new instance has been created.")
    }

    companion object
    {
        var instance:Singleton = Singleton()
    }
}

fun main(args:Array<String>)
{
    var sing1 = Singleton.instance
    sing1.name = "Tokyo"
    println(sing1.name)

    var sing2 = Singleton.instance
    println(sing2.name)

    var sing3 = Singleton.instance
    println(sing3.name)

}