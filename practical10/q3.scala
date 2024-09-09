class account(var balance:Double){
    def deposit(amount:Double):Unit={
        balance=balance+amount
    }
    def withdraw(amount:Double):Unit={
        if(balance>amount && amount>0){
            balance=balance-amount
        }else{
            println("insufficient or amount should positive")
        }
    }
    def transfer(amount:Double,toAccount:account):Unit={
        if(balance>amount && amount>0){
            this.withdraw(amount)
            toAccount.deposit(amount)
        }else{
            println("insufficient or amount shouls positive")
        }
    }
    def getbalance():Double={
        balance
    }
}
 object Bank{
    def main(args:Array[String]):Unit={
        val acc1=new account(500)
        val acc2=new account(500)
        val deposit=acc1.deposit(500)
        val withdraw=acc1.withdraw(250)
        val transfer=acc1.transfer(200,acc2)
        val newacc1=acc1.getbalance()
        val newacc2=acc2.getbalance()
        println(s"account 1 balance:$newacc1")
        println(s"account 2 balance:$newacc2")
    }
 }