class MyCar (var type:String, var model:Int, var millage:Int, var price:Double, var owner:String )
{
    /*init {
        println("\nNew car created")
        println("Type: "+type)
        println("Model: "+model)
        println("Millage: "+millage)
        println("Price: "+price)
        println("Owner: "+owner)
    }*/
}

fun main(args:Array<String>)
{
    val car1 = MyCar("Jaguar",2018, 0, 8000000.0, "Pete")
    val car2 = MyCar("Toyota Hillux", 2018, 0, 5000000.0, "Stevoh")
    val car3 = MyCar("Mercedes", 2015, 20, 4000000.0, "Ludah")

    println("\n=======================")
    println("car1 : "+car1.type)
    println("car1 : "+car1.model)
    println("car1 : "+car1.millage)
    println("car1 : "+car1.price)
    println("car1 : "+car1.owner)

    println("\n=======================")
    println("car2 : "+car2.type)
    println("car2 : "+car2.model)
    println("car2 : "+car2.millage)
    println("car2 : "+car2.price)
    println("car2 : "+car2.owner)

    println("\n========================")
    println("car3 : "+car3.type)
    println("car3 : "+car3.model)
    println("car3 : "+car3.millage)
    println("car3 : "+car3.price)
    println("car3 : "+car3.owner)
}