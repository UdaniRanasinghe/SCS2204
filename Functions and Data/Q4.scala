//19001339

object Q4 extends  App {
  var bank = List(new Account("998110041V",87654,10500.00), new Account("942392749V",84354, -100.00), new Account("849240275V", 83620, 1000.000), new Account("859210836V", 83492,-500.00), new Account("7834920475V",83549,5000.00))

  //Q4.1
  println("Accounts that have a negative balance")
  var negativeAccount = bank.filter(x => x.balance<0)
  println(negativeAccount)

  //Q4.2
  println("\nSum of all account balances")
  var sum = bank.map(x=> x.balance).reduce((x,y) => x+y)
  println("Rs."+sum)

  //Q4.3
  println("\nFinal balances of all accounts after applying the interest function")
  bank = bank.map(x =>x.interest())
  println("Rs."+bank)
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

  def interest():Account = {
    if(this.balance >= 0){
      this.balance += this.balance*0.05
      return this
    }
    else{
      this.balance += this.balance*0.1
      return this
    }
  }

  override def toString: String = "[ NIC : " + nic +"\tAcc no : " + ac_num + "\t Balance : " + balance + "]"
}
