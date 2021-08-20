object Q3 extends App{
  val ac1 = new Account("998110041V",4231341, 45000.00)
  val ac2 = new Account("975114645V",4231354, 25000.00)

  println("Account Details ")
  println(ac1.toString)
  println(ac2.toString)

  println("\nAccount Details after transferring Rs.10,000 from first account ")
  ac1.transfer(ac2,10000.00)
  println(ac1.toString)
  println(ac2.toString)
}

class Account (id:String, n:Int, b:Double){
  val nic = id
  val ac_num = n
  var balance = b

  def withdraw(amt:Double) = this.balance -= amt
  def deposit(amt:Double) = this.balance = this.balance + amt

  def transfer(acc:Account, amt:Double)= {
    this.withdraw(amt)
    acc.deposit(amt)
  }

  override def toString: String = "[ NIC : " + nic +"\tAcc no : " + ac_num + "\t Balance : " + balance + "]"
}