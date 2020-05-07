fun ArrayList<String>.swap(index1:Int, index2:Int)
{
    var temp = this.get(index1)
    this.set(index1, this.get(index2))
    this.set(index2, temp)
}

fun main(args:Array<String>)
{
    var arrayList = ArrayList<String>()
    arrayList.add("Stephen")
    arrayList.add("Martin")
    arrayList.add("George")
    arrayList.add("Elvis")
    arrayList.add("Brian")
    arrayList.add("Lewis")
    arrayList.add("Billy")
    arrayList.add("Peter")
    arrayList.add("Giddy")
    arrayList.add("Dennis")
    println( arrayList)
    arrayList.swap(7, 8)
    println( arrayList)
}