import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>)
{
    //readFromFile()
    println("1 -> Read\n" +
            "2 -> Write\n")
    var op:Int = readLine()!!.toInt()
    when(op)
    {
        1 -> {
            readFromFile()
        }
        2 -> {
            println("\nWrite a text: ")
            var text:String = readLine().toString()
            writeToFile(text)
        }
    }

    //readFromFile()
}

fun readFromFile() {
    try {
        var fin = FileReader("text.txt")
        var n:Int?
        do {
            n = fin.read()
            print(n.toChar())

        }while (n != -1)
    }catch (ex:Exception)
    {
        println(ex.message)
    }
}

fun writeToFile(str:String) {
    try{
        var fo = FileWriter("text.txt")
        fo.write(str+"\n")
        fo.close()
        println("\nYour data is saved")
    }catch (ex:Exception)
    {
        println(ex.message)
    }

/*fun readFromFile()
{
    try {
        var fin = FileReader("text.txt")
        var n:Int?
        do {
            n = fin.read()
            print(n.toChar())

        }while (n != -1)
    }catch (ex:Exception)
    {
        println(ex.message)
    }
}*/
}