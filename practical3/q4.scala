object sum_od_even
{
    def sumeven(num:List[Int]):Int=
    {
        var sum=0
        num match
        {
            case Nil => 0
            case head ::tail =>
                if(head%2==0)
                    sum+=head
                sum+=sumeven(tail)
        }
        sum
    }

    def main(args:Array[String]):Unit={
        val numbers=List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val result=sumeven(numbers)
        println(s"sum:$result")
    }
}