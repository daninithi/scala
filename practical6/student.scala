object student{
    def getStudentInfo(name:String,marks:Int,totalmarks:Int):(String,Int,Int)={
        (name,marks,totalmarks)
    }
    def validateInput(name:String,marks:Int,totalmarks:Int):(Boolean,Option[String])={
        if(name.isEmpty){
            (false,Some("name is empty"))
        } else if (marks <0 || marks >totalmarks){
            (false,Some("marks must be positive and less than total possible marks"))
        } else {
            (true,None)
        }
    }
    def getStudentInfoWithRetry(): (String, Int, Int) = {
        println("Enter student name")
        val name = scala.io.StdIn.readLine()
        println("Enter student marks")
        val marks = scala.io.StdIn.readInt()
        println("Enter total possible marks")
        val totalmarks = scala.io.StdIn.readInt()
        val (isValid, error) = validateInput(name, marks, totalmarks)
        if (isValid) {
            getStudentInfo(name, marks, totalmarks)
        } else {
            println(error.get)
            getStudentInfoWithRetry()
    }
    }

    def printStudentRecord(name:String,marks:Int,totalmarks:Int):Unit={
        val percentage=(marks.toDouble/totalmarks)*100
        val grade = percentage match {
        case p if p >= 90 => 'A'
        case p if p >= 75 => 'B'
        case p if p >= 50 => 'C'
        case _ => 'D'
      }
        println(s"Student Name: $name")
        println(s"Marks: $marks")
        println(s"Total Marks: $totalmarks")
        println(s"Percentage: $percentage%")
        println(s"Grade: $grade")
    }


    def main(args:Array[String]):Unit={
        val (name,marks,totalmarks) = getStudentInfoWithRetry()
        printStudentRecord(name,marks,totalmarks)



    }
}