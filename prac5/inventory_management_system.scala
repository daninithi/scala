object inventort_management_system
{
    def getProductList(products: List[String] = Nil): List[String] = {
    val input = scala.io.StdIn.readLine("Enter product name (or type 'done' to finish): ")
    if (input.toLowerCase == "done") products
    else getProductList(products :+ input)
  }
    def printproductlist(products:List[String]):Unit={
    for(i<-products.indices){
        println(s"${i+1}.${products(i)}")
    }
  }
    def total(products:List[String]):Int={
    products.size
  }
    def main(args:Array[String]):Unit= {
    val productlist=getProductList()
    printproductlist(productlist)
    println(s"no.of products:${total(productlist)}")
  }
    
}