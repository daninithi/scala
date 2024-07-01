
object string
{
    def length_string(s:List[String]):List[String]=
    {
       s match{
        case Nil => Nil
        case head ::tail =>
            if (head.length>5)
                head ::length_string(tail)
            else
                length_string(tail)
       } 
    }
    def main(args:Array[String]):Unit={
        val strings=List("Scala", "Java", "Python", "JavaScript", "Ruby", "C++", "Rust")
        val filteredList =length_string(strings)
        println(s"strings with length greater then 5:$filteredList")
    }
}