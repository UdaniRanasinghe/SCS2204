//19001339

object Q2 extends App{
  val x= new Rational(3,4)
  val y= new Rational(5,8)
  val z= new Rational(2,7)

  println(x-y-z)
}
class Rational(x:Int, y:Int) {
  def numer=x
  def denom = y

  def neg = new Rational(-1* this.numer,denom)
  def +(r:Rational) = new Rational(this.numer * r.denom+r.numer * this.denom, denom*r.denom)
  def -(r:Rational) = this+r.neg
  override def toString: String = numer+"/"+denom
}
