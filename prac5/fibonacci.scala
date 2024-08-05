object fibonacci{
    def fibonacci(num:Int):Int={
        if (num<=1)
            num
        else fibonacci(num-1)+fibonacci(num-2)
    }
    def main(args: Array[String]): Unit = {
        val n = scala.io.StdIn.readInt()
        println(s"Fibonacci series :")
        for (i <- 0 until n) {
            print(s"${fibonacci(i)}")
            print(" ")
        }
        println()
}
}