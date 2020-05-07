fun main(args:Array<String>)
{
    var t1 = thread("Thread One")
    t1.start()

    var t2 = thread("ThreadTwo")
    t2.start()

    var t3 = thread("ThreadThree")
    t3.start()
}

class thread():Thread()
{
    var ThreadName:String = ""
    constructor(ThreadName:String):this()
    {
        this.ThreadName = ThreadName
                println("$this.Threadname is started")
    }

    override fun run() {
        var count = 0
        while (count < 50) {
            println("$this.ThreadName Count: $count")
            count++
        }

        try {
            Thread.sleep(2000)
        }catch (ex:Exception)
        {
            println(ex.message)
        }
    }
}
