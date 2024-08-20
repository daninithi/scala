object NameFormatter {

  // Method to convert a string to uppercase
  def toUpper(name: String): String = name.toUpperCase

  // Method to convert a string to lowercase
  def toLower(name: String): String = name.toLowerCase

  // Method to format names using a given formatting function
  def formatNames(name: String, formatFunction: String => String): String = formatFunction(name)

  def main(args: Array[String]): Unit = {
    // Test names
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    // Apply formatting functions and print results
    val formattedNames = names.map { name =>
      name match {
        case "Benny" => formatNames(name, toUpper)
        case "Niroshan" => formatNames(name, name => name.take(2).toUpperCase + name.drop(1).toLowerCase)
        case "Saman" => formatNames(name, toLower)
        case "Kumara" => formatNames(name, name => name.init + name.last.toUpper)
      }
    }

    // Print formatted names
    println(formattedNames.mkString(" "))
  }
}
