case class book(title:String,author:String,isbn:String)
object library
{
    var library:Set[book]=Set(
    book("a", "john", "1"),
    book("b", "ram", "2"),
    book("c", "kumar", "3")
  )

    def addbook(book:book):Unit={
    library.find(_.isbn==book.isbn) match{
        case Some(book)=>
            println("book is already exist")
        case None=>
            library+=book
    }
    }
    def removebook(isbn:String):Unit={
        library.find(_.isbn==isbn) match{
            case Some(book)=>
                library-=book
                println("book removed")
            case None=>
                println("no book found")
        }
    }
    def checkbook(isbn:String):Unit={
        library.find(_.isbn==isbn) match{
            case Some(book)=>
                println("book is already in the library")
            case None=>
                println("no book found")
        }
    }
    def searchbook(title:String):Unit={
        library.find(_.title.equalsIgnoreCase(title)) match{
            case Some(book)=>
                println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
            case None=>
                println("no book found")
        }
    }
    def bookauthor(author:String):Unit={
       val books = library.filter(_.author.equalsIgnoreCase(author))
        books.size match {
            case 0 => println("No books found by this author.")
            case _ => books.foreach(book => println(book))
    }
    }
    def main(args:Array[String]):Unit={
        if(library.isEmpty){
            println("empty")}
        else{
        library.foreach(book=>println(book))}
        var continue = true

        while (continue) {
        println(
        """Library Management System:
          |1. Add a new book
          |2. Remove a book by ISBN
          |3. Check if a book is in the library by ISBN
          |4. Search for a book by title
          |5. Display all books by a specific author
          |6. Exit""")
        println("choose an option:")
         val input=scala.io.StdIn.readInt()
        input match {
        case 1 =>
          val title = scala.io.StdIn.readLine("Enter book title: ")
          val author = scala.io.StdIn.readLine("Enter book author: ")
          val isbn = scala.io.StdIn.readLine("Enter book ISBN: ")
          addbook(book(title, author, isbn))
        case 2=>
          val isbn=scala.io.StdIn.readLine("enter the isbn of the book to remove:")
          removebook(isbn)
        case 3=>
          val isbn=scala.io.StdIn.readLine("enter the isbn of the book to check:")
          checkbook(isbn)
        case 4=>
          val title=scala.io.StdIn.readLine("enter the title of the book to search:")
          searchbook(title)
        case 5=>
          val author=scala.io.StdIn.readLine("enter the author of book to search:")
          bookauthor(author) 

        case 6 => continue = false
        case _ => println("Invalid option. Please choose again.")
        }
    }
  }
}
  
