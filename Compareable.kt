import java.util.*
import kotlin.collections.ArrayList

class City( var name:String, var age:Int):Comparable<City>
{
    override fun compareTo(other: City): Int {
        return this.age - other.age
    }
}

fun main(args:Array<String>)
{
    var myArray = ArrayList<City>()
    myArray.add(City("Accra", 57) )
    myArray.add(City("Nairobi", 58))
    myArray.add(City("Bujumbura", 54))
    myArray.add(City("Antananarivo", 53))
    myArray.add(City("Maseru",45))
    myArray.add(City("Lagos", 50))
    myArray.add(City("Pretoria", 46))
    for (city in myArray)
    {
        println("City: "+city.name)
        println("Age: "+city.age)
    }
    print("\n--------------------")
    println("\nAfter sort")
    Collections.sort(myArray)
    for (city in myArray)
    {
        println("City: "+city.name)
        println("Age: "+city.age)
    }
}