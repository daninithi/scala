object number{
    val isMultiplethree:Int=>Boolean=x=>x%3==0

    val isMultiplefive:Int=>Boolean=x=>x%5==0

    val isMultipleboth:Int=>Boolean=x=>x%3==0 && x%5==0 
    
    def number(num:Int):Unit={
        num match{
            case x if isMultipleboth(x)=> println("multiple of both three and five")
            case x if isMultiplethree(x)=> println("multiple of three")
            case x if isMultiplefive(5)=> println("multiple of five")
            case _=>println("not a multiple of three and five")
        }
    }

        def main(args:Array[String]):Unit={
            val num=scala.io.StdIn.readInt
            (number(num))
        }
    
}