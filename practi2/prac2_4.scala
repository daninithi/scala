object movie{
    def attendees(ticket_price:Int):Int={
        120+(15-ticket_price)/5*20
    }
    def revenue(ticket_price:Int):Int={
        attendees(ticket_price)*ticket_price
    }
    def cost(ticket_price:Int):Int={
        500+3*attendees(ticket_price)
    }
    def profit(ticket_price:Int):Int={
        revenue(ticket_price)-cost(ticket_price)
    }
    def main(args:Array[String]):Unit={
        val ticket_price=scala.io.StdIn.readInt()
        println(s"Attendees: ${attendees(ticket_price)}")
        println(s"Revenue: ${revenue(ticket_price)}")
        println(s"Cost: ${cost(ticket_price)}")
        println(s"Profit: ${profit(ticket_price)}")
    }
}