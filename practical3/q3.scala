object mean {
  def findavg(num1: Int, num2: Int): Float = {
    val sum = num1 + num2
    val avg = sum / 2.0f 
    val roundedvalue = BigDecimal(avg).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
    roundedvalue
 }
    

  def main(args: Array[String]): Unit = {
    val average = findavg(10, 13)
    println(f"average: $average%.2f")
  }
}
