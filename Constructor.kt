open class Car()
{
    var type:String? = null
    var model:Int? = null
    var manufacture:String? = null
    var millage:Int? = null
    var price:Double? = null
    var owner:String? = null

    constructor(type:String, model:Int, manufacture:String, millage:Int, price:Double,
                owner:String) :this(){
        this.type = type
        this.model = model
        this.manufacture = manufacture
        this.millage = millage
        this.price = price
        this.owner = owner
    }

    fun getCarPrice():Double
    {
        return this.price!! - (this.millage!!.toDouble()*10)
    }

}

fun main(args:Array<String>)
{
    val car1 = Car()
    val car2 = Car()
    val car3 = Car()

    println("\n=======================")
    println("car1 : "+car1.type)
    println("car1 : "+car1.model)
    println("car1 : "+car1.millage)
    println("car1 : "+car1.price)
    println("car1 : "+car1.manufacture)
    println("car1 : "+car1.owner)

    println("\n=======================")
    println("car2 : "+car2.type)
    println("car2 : "+car2.model)
    println("car2 : "+car2.millage)
    println("car2 : "+car2.price)
    println("car1 : "+car2.manufacture)
    println("car2 : "+car2.owner)

    println("\n========================")
    println("car3 : "+car3.type)
    println("car3 : "+car3.model)
    println("car3 : "+car3.millage)
    println("car3 : "+car3.price)
    println("car1 : "+car3.manufacture)
    println("car3 : "+car3.owner)
}