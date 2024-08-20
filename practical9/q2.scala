object patternmatching{
    def main(args:Array[String]):Unit={
        val matchno:Int=>String =(number:Int)=>{
         number match{
            case x
                if(x<=0)=>"negative/zero"
            case x
                if(x%2==0)=>"even number"
            case x
                if (x%2!=0)=>"odd number"
         }
        }

        val input=scala.io.StdIn.readInt()
        val result=matchno(input)
        println(s"$input:$result")
    }
}