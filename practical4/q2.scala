object patternmatching{
    def patternmatch(num:Int):Unit={
        num match{
            case x 
                if(x==0)  =>
                    println("Zero is input")
            case x
                if(x<0) =>
                    println("negative")
            case x
                if(x%2==0) =>
                    println("Even number is given")
            case _=>
                    println("odd number is given")


        }
    }
    def main(args:Array[String]):Unit={
        val num=scala.io.StdIn.readInt()
        patternmatch(num)
    }
    
}