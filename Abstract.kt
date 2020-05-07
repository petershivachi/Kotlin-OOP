open abstract class Vehicle()
{
    fun display():String
    {
        return "Toyota General Motors"
    }

    /*override fun newCar()
    {
        println("\nNew car created.")
    }*/
}

class SaloonCar(): Vehicle()
{
    fun getMan():String
    {
        return display()
    }
}

fun main(args:Array<String>)
{
    var carinfo = SaloonCar()
    println("Car Manufacturer : "+carinfo.display())
}