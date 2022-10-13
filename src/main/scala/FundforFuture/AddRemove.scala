package FundforFuture
import scala.io.StdIn.{readInt, readLine}
//This class is used to add and remove money to acoount

class AddRemove extends Account{

  def credit(): Unit = {
    var credit_amount: Int = 0
    println("Enter the account number you want to credit in: ")

    // readInt is used to take integer
    // value as input from user
    val acc_num1 = readInt()

    // indexOf() method returns the index
    // of particular element
    val index1 = account_number.indexOf(acc_num1)
    println("Enter the amount you want to credit: ")
    credit_amount = readInt()
    balance_amt(index1) += credit_amount
    println("Amount added successfully\nNew Balance is: " +
      balance_amt(index1))
  }

  // Used to withdraw money from an account
  def debit(): Unit = {
    var debit_amount: Int = 0
    println("Enter the account number " +
      "you want to withdraw from: ")
    val acc_num2 = readInt()
    val index2 = account_number.indexOf(acc_num2)
    println("Enter the amount you want to withdraw: ")

    debit_amount = readInt()
    balance_amt(index2) -= debit_amount
    println("Money withdrawn successfully\n" +
      "Remaining balance is: " +
      balance_amt(index2))
  }
}

object add_remove_amount extends App{
  var add_obj = new AddRemove
  add_obj.credit()
  add_obj.debit()

}
