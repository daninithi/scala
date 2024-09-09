object number{
    val isMultiplethree:Int=>Boolean=x=>x%3==0

    val isMultiplethreefour:Int=>Boolean=x=>x%3==0 && x%4==0

    val isMultiplefive:Int=>Boolean=x=>x%5==0

    val isMultipleboth:Int=>Boolean=x=>x%3==0 && x%5==0 && x%4==0

    val isMultiplefour:Int=>Boolean=x=>x%4==0
    
    def number(num:Int):Unit={
        num match{
            case x if isMultipleboth(x)=> println("multiple of both three,four and five")
             case x if isMultiplethreefour(x)=> println("multiple of both three and four")
            case x if isMultiplethree(x)=> println("multiple of three")
            case x if isMultiplefive(x)=> println("multiple of five")
            case x if isMultiplefour(x)=> println("multiple of four")
            case _=>println("not a multiple of three,four and five")
        }
    }

        def main(args:Array[String]):Unit={
            val num=scala.io.StdIn.readInt
            (number(num))
        }
    
}