object reversestring
{
    def reverse(str:String):String=
    {
        str match
        {
            case ""=>""
            case _ =>reverse(str.tail)+str.head
        }
    }
    def main(args: Array[String]): Unit = {
    val originalString = "Scala is awesome!"
    val reversedString = reverse(originalString)
    println(s"Original String: $originalString")
    println(s"Reversed String: $reversedString")
  }
}