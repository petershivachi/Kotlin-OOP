fun ArrayList<String>.change(index1:Int, index2:Int)
{
    var position = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, position)
}

fun ArrayList<String>.move(index3:Int, index4:Int)
{
    var place = this.get(index3)

    this.set(index3, this.get(index4))
    this.set(index4, place)
}


fun main(args:Array<String>)
{
    var myArray = ArrayList<String>()
    myArray.add("Nairobi")
    myArray.add("Mombasa")
    myArray.add("Kampala")
    myArray.add("Dodoma")
    myArray.add("Mogadishu")
    myArray.add("Cairo")
    myArray.add("Pretoria")
    myArray.add("Lagos")
    myArray.add("Accra")
    println(myArray)
    myArray.change(4, 5)
    println(myArray)
    myArray.move(7, 6)
    println(myArray)
}