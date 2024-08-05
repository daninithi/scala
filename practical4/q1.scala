object inventory{
    var item_name:Array[String]=Array()
    var quantity:Array[Int]=Array()

    def displayInventory():Unit={
        println("enter the no.of items:")
        val n=scala.io.StdIn.readInt()
        item_name=new Array[String](n)
        quantity=new Array[Int](n)
    
        for(i<-0 until n){
        println("Enter name for item :")
        item_name(i) = scala.io.StdIn.readLine()
        println("Enter quantity for item :")
        quantity(i) = scala.io.StdIn.readInt()}

        println("Inventory:")
        for (i <- item_name.indices) {
        println(s"${item_name(i)}: ${quantity(i)}")
    }



    }
    def restockItem(itemname:String,new_quantity:Int):Unit={
    val index = item_name.indexOf(itemname)
    if (index != -1) {
      quantity(index) += new_quantity
      println(s"Restocked $itemname. New quantity: ${quantity(index)}")
    } else {
      println(s"Item $item_name does not exist.")
    }
  }
    
    def sellItem(itemname:String,new_quantity:Int):Unit={
        val index = item_name.indexOf(itemname)
        if (index != -1) {
        if(quantity(index)>=new_quantity){
        quantity(index) -= new_quantity
        println(s"sold $itemname. remaining quantity: ${quantity(index)}")
        } else {
      println(s"not enough.")
        }}
        else{
        println(s"item doesn't exist")
        }
    }
    def main(args:Array[String]):Unit={
       
       displayInventory()
       restockItem("apple",5)
       sellItem("banana",10)

    }
}
