object q4{
    val coverPrice=24.95
    val discount=0.4
    def Discount(price:Double,discount:Double):Double={
    price*(1-discount)
    
    }
    def shippingCost(copies:Int):Double={
        if(copies<=50){
            3.00
        }
        else{
            4+(copies-50)*0.75
        }
    }
    def totalCost(copies:Int):Double={
        copies*Discount(coverPrice,discount)+shippingCost(copies)
    }
   def main(args:Array[String]):Unit={
   println(totalCost(60)) 
   }
}