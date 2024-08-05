
object prac2_3{
    def main(args: Array[String]): Unit ={
        var normal: Float=250f
        var ot: Float =85f
        val norhr=scala.io.StdIn.readFloat()
        val othr=scala.io.StdIn.readFloat()
        val salary: Float= (norhr*normal*othr*ot)*0.12f
        println(s"salary:$salary")


    }

}