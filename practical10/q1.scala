class rationalNumber(numer:Int,denom:Int){
        require(denom!=0,"denominator can't zero")

        def neg: rationalNumber=new rationalNumber(-numer,denom)

        override def toString:String=s"$numer/$denom"
}

object negRationalNumber{
    def main(args:Array[String]):Unit={
        println("numerator:")
        val num=scala.io.StdIn.readInt()
        println("denominator:")
        val denom=scala.io.StdIn.readInt()
        val rat=new rationalNumber(num,denom)
        val negRat=rat.neg
        println(s"rational number:$rat")
        println(s"negative rational number:$negRat")
    }
}
