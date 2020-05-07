fun ArrayList<String>.shuffle(index1:Int, index2:Int)
{
    var locate = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, locate)
}

fun ArrayList<String>.load(index3:Int, index4:Int)
{
    var locate1 =this.get(index3)
    this.set(index3, this.get(index4))
    this.set(index4, locate1)
}

fun ArrayList<String>.lacerate(index5:Int, index6:Int)
{
    var locate2 = this.get(index5)
    this.set(index5, this.get(index6))
    this.set(index6, locate2)
}

fun main(args:Array<String>)
{
    var thisArray = ArrayList<String>()
    thisArray.add("Kenya")
    thisArray.add("Ethiopia")
    thisArray.add("Tanzania")
    thisArray.add("Rwanda")
    thisArray.add("Burundi")
    thisArray.add("Uganda")
    thisArray.add("Djibouti")
    thisArray.add("Eritrea")
    thisArray.add("Sudan")
    thisArray.add("Egypt")
    thisArray.add("Gabon")
    println(thisArray)
    thisArray.shuffle(4, 5)
    println(thisArray)
    thisArray.load(1, 4)
    println(thisArray)
    thisArray.lacerate(2, 3 )
    println(thisArray)
}