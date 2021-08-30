//R. P. K. U. P. Ranasinghe
//19001339

import math.{ sqrt, pow }

object Main extends App{
  var p1=Point(3,4)
  var p2=Point(8,2)

  var p3=p1.move(2,2)
  var p4=p1.distance(p2)

  println("P1: " + p1)
  println("P2 : " + p2)
  print("P1 + P2 : ")
  println(p1+p2)
  println("Move P1 by given points : "+ p3)
  println("Distance between P1 and P2 : "+ p4)
  println("Inverse of P2 : "+ p2.invert)
}

case class Point(a:Int, b:Int){
  def x: Int =a;
  def y: Int =b;

  //Q1
  def + (that:Point)= Point(this.x + that.x , this.y+that.y)

  //Q2
  def move(dx:Int, dy:Int) =Point(this.x+dx , this.y+dy)

  //Q3
  def distance (that:Point) = sqrt(pow((that.x-this.x),2) + pow((that.y-this.y),2))

  //Q4
  def invert:Point ={
    Point(y,x)
  }

  override def toString= "("+x+","+y+")"
}
