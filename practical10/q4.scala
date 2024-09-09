class Account(var balance:Double){
    def listNegativeBalance():Boolean={
            (balance<0)
    }
    def interest():Unit={
        if(balance>0){
             balance=balance+balance*0.05
        } else if (balance<0){
            balance=balance+balance*0.1
        }
    }
    def getbalance():Double={
        balance
    }

    override def toString: String = s"Account(balance: $$${balance})"
}

class Bank(var accounts:List[Account]){
    def accWithNegativeBalance():List[Account]={
        accounts.filter(_.listNegativeBalance())
    }
    def totalBalance():Double={
        accounts.map(_.getbalance()).sum
    }
    def interestAll():Unit={
        val interestall=accounts.foreach(_.interest())
        accounts.foreach(println)
    }
}

object bankAccounts{
    def main(args:Array[String]):Unit={
        val account1 = new Account(500)     
        val account2 = new Account(-300)    
        val account3 = new Account(200)     
        val account4 = new Account(-100)
        
        val bank=new Bank(List(account1,account2,account3,account4))

        val negativeAccounts = bank.accWithNegativeBalance()
        println("Accounts with negative balances:")
        negativeAccounts.foreach(println)

        val total = bank.totalBalance()
        println(s"Total balance of all accounts: $total")

        bank.interestAll()
    }
}

   
