class rationalNumber(val numer:Int,val denom:Int){
        require(denom!=0,"denominator can't zero")

        def neg: rationalNumber=new rationalNumber(-numer,denom)

        def sub(that:rationalNumber):rationalNumber={
            val commonDenom=this.denom*that.denom
            val newNumer=(this.numer*that.denom)-(that.numer*that.denom)
            new rationalNumber(newNumer,commonDenom)
        }

        override def toString:String=s"$numer/$denom"
}

object negRationalNumber{
    def main(args:Array[String]):Unit={
        val x=new rationalNumber(3,4)
        val y=new rationalNumber(5,8)
        val z=new rationalNumber(2,7)
        println(s"x:$x")
        println(s"y:$y")
        println(s"x:$z")
        val negY=y.neg
        val negZ=z.neg
        val result=x.sub(y)
        println(s"subtraction:$result")
        val finalresult=result.sub(z)
        println(s"subtraction:$finalresult")
    }
}