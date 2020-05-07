class Student(var reg_no:String, var name:String, var date_of_birth:String,
              var faculty:String, var course:String, var fees:Double)
{
   /*init {
       println("Registration number : "+reg_no)
       println("Name : "+name)
       println("Date Of Birth : "+date_of_birth)
       println("Faculty : "+faculty)
       println("Course : "+course)
       println("Fees : "+fees)
   }

    fun getStudentAge():Int
    {
        return this
    }*/
}

fun main(args:Array<String>)
{
    val student1 = Student("18/03142", "Shitsukane Peter", "06/01/2000",
            "FOCIM", "Software engineering", 20000.00)
    val student2 = Student("18/03120", "Stephen Wambua", "21/05/1999",
            "FOCIM", "Software Engineering", 20000.00)
    val student3 = Student("18/02765", "Brian Nyaberi", "16/05/1999",
            "FOCIM", "Software Engineering", 20000.00)

    //Output for the above process
    println("\nAnalysis for the first student:")
    println("------------------------------------")
    println("Registration Number : "+student1.reg_no)
    println("Name : "+student1.name)
    println("Date Of Birth : "+student1.date_of_birth)
    println("Faculty : "+student1.faculty)
    println("Programme : "+student1.course)
    println("Fees : "+student1.fees)

    println("\nAnalysis for the second student: ")
    println("--------------------------------------")
    println("Registration Number : "+student2.reg_no)
    println("Name : "+student2.name)
    println("Date Of Birth : "+student2.date_of_birth)
    println("Faculty : "+student2.faculty)
    println("Programme : "+student2.course)
    println("Fees : "+student2.fees)

    println("\nAnalysis for the third student: ")
    println("--------------------------------------")
    println("Registration Number : "+student3.reg_no)
    println("Name : "+student3.name)
    println("Date Of Birth : "+student3.date_of_birth)
    println("Faculty : "+student3.faculty)
    println("Programme : "+student3.course)
    println("Fees : "+student3.fees)
}