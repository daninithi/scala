object StringFormatter {
  def toUpper(str: String): String = {
    str.toUpperCase
  }

  def toLower(str: String): String = {
    str.toLowerCase
  }

  def formatNames(name: String)(format: String => String): String = {
    format(name)
  }

  def main(args: Array[String]): Unit = {
    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    val result1 = formatNames(name1)(toUpper)
    val result2 = formatNames(name2)(name => {
      val firstTwoUpper = name.substring(0, 2).toUpperCase
      val restLower = name.substring(2).toLowerCase
      firstTwoUpper + restLower
    })
    val result3 = formatNames(name3)(toLower)
    val result4 = formatNames(name4)(name => {
      val firstLower = name.substring(0, 1).toLowerCase
      val middleUpper = name.substring(1, name.length - 1)
      val lastUpper = name.substring(name.length - 1).toUpperCase
      firstLower + middleUpper + lastUpper
    })
    
    println(result1)
    println(result2)
    println(result3)
    println(result4)
  }
}
