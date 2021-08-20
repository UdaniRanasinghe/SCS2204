//19001339

object Q1 extends App{
  val r1 = new Rational(3,4)
  println((r1.neg).toString)

}

class Rational (x:Int, y:Int){
  def numer =x
  def denom=y

  def neg = new Rational(-1 * this.numer, denom)
  override def toString: String = numer+"/"+denom

}
