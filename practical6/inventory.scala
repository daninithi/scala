import scala.io.StdIn.{readInt, readLine}

object MapInventory {
  def retrieve(): Map[Int, List[String]] = {
    println("Enter the number of products:")
    val numberOfProducts = readInt()
    var inventory = Map[Int, List[String]]()

    for (i <- 1 to numberOfProducts) {
      var values = List[String]()
      println(s"Enter the values id, name, quantity, price for the product '$i' in order:")
      for (j <- 1 to 4){
        val value = readLine()
        values = values :+ value
      }
      inventory += (i -> values)
    }

    inventory
  }
  
  def totalquantity(inventory: Map[Int, List[String]]): Int = {
    var total = 0
    for ((_, values) <- inventory) {
      val quantity = values(2).toInt
      total = total + quantity
    }
    total
  }

  def checkempty(inventory: Map[Int, List[String]]): String = {
    if (inventory.isEmpty) {
      "The inventory is empty"
    } else {
      "The inventory is not empty"
    }
  }

  def mergeInventories(inventory1: Map[Int, List[String]], inventory2: Map[Int, List[String]]): Map[Int, List[String]] = {
    var mergedInventory = inventory1

    for ((key2, values2) <- inventory2) {
      val id2 = values2(0)
      var found = false

      for ((key1, values1) <- mergedInventory) {
        val id1 = values1(0)
        if (id1 == id2) {
          val quantity1 = values1(2).toInt
          val quantity2 = values2(2).toInt
          val price1 = values1(3).toDouble
          val price2 = values2(3).toDouble

          val updatedQuantity = (quantity1 + quantity2).toString
          val updatedPrice = math.max(price1, price2).toString

          mergedInventory += (key1 -> List(id1, values1(1), updatedQuantity, updatedPrice))
          found = true
        }
      }

      if (!found) {
        mergedInventory += (mergedInventory.size + 1 -> values2)
      }
    }

    mergedInventory
  }

  def checkId(inventory: Map[Int, List[String]], id: String): Map[Int, List[String]] = {
    inventory.filter { case (_, values) => values(0) == id }
  } 


  def main(args: Array[String]): Unit = {
    println("Retrieve first inventory:")
    val inventory1 = retrieve()
    println(s"Details of first inventory: $inventory1")
    val totalQuantity1 = totalquantity(inventory1)
    println(checkempty(inventory1))
    println(s"Total quantity of first inventory: $totalQuantity1")

    println("Retrieve second inventory:")
    val inventory2 = retrieve()
    println(s"Details of second inventory: $inventory2")
    val totalQuantity2 = totalquantity(inventory2)
    println(checkempty(inventory2))
    println(s"Total quantity of second inventory: $totalQuantity2")

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println(s"Merged inventory details: $mergedInventory")
    val totalQuantityMerged = totalquantity(mergedInventory)
    println(checkempty(mergedInventory))
    println(s"Total quantity of merged inventory: $totalQuantityMerged")

    println("Which inventory do you want to search? (1 for first inventory, 2 for second inventory):")
    val inventoryChoice = readInt()

    println("Enter the ID to check:")
    val idToCheck = readLine()
    val idCheckResult = inventoryChoice match {
      case 1 => checkId(inventory1, idToCheck)
      case 2 => checkId(inventory2, idToCheck)
      case _ => 
        println("Invalid choice. Please enter 1 or 2.")
    }
    println(s"Inventory entries with ID '$idToCheck': $idCheckResult")

  }
}
