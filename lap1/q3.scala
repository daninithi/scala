object esq3{
    def volume(r:Double):Double={
    4/3*math.Pi*r*r*r
    
    }
   def main(args:Array[String]):Unit={
   println("Volume of a sphere: " +volume(5)) 
   }
}