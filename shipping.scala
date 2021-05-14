object shipping extends App {
  def cost (x : Int) : Double = {
    var sum:Double = x*24.95
    sum = sum*60/100 //discounted price
    sum+= 3  //shipping cost for first 50 copies

    var additional:Int = x-50
    sum += additional * 0.75
    return sum

  }

  println(cost(60))
}
