object interest{
    def main(args:Array[String]):Unit={
        val calinterest:Double=>Double=(deposit:Double)=>{
            if (deposit <= 20000) {
        deposit * 0.02
      } else if (deposit <= 200000) {
        deposit * 0.04
      } else if (deposit <= 2000000) {
        deposit * 0.035
      } else {
        deposit * 0.065
      }
        }

        val depositAmount: Double = 2500000
        val interestEarned: Double = calinterest(depositAmount)
    
        println(f"Interest earned on Rs. $depositAmount%.2f is Rs. $interestEarned%.2f")
    }
}