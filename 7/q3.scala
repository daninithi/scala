
object primenumber{
    def isprime(n:Int):Boolean=n match {
        case _ if n<=1 => false
        case 2 => true
        case _ if n%2==0 => false
        case _ =>
        (3 to Math.sqrt(n).toInt by 2).forall(i =>n%i!=0)
        
}
    def filerprime(numbers:List[Int]):List[Int]={
        numbers.filter(n=> isprime(n))
    }

    def main(args: Array[String]): Unit = {
    val inputlist = List(1,2,3,4,5,6,7,8,9,10)
    println(filerprime(inputlist))
   
  }
}
