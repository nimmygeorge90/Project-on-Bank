package FundforFuture
import scala.io.StdIn.{readInt, readLine}
//This is the child class of the account and the class is used to add and remove amount to the particular account

class AddRemove extends Account{

  def add(): Unit = {  //The function is used credit amount in the given account
    var credit_amount: Int = 0 //Declare variable to add the amount
    println("Enter the account number you want to credit in: ")// value as input from user
    val acc_num1 = readInt()
    val index_account = account_number.indexOf(acc_num1)// indexOf() method returns the index of acc_number
    println("Enter the amount you want to credit: ")//Getting the amount to credit
    credit_amount = readInt()
    balance_amt(index_account) += credit_amount //Adding credit and amount
    println("Amount added successfully") // Printing Successfully
    println("New Balance is: " + balance_amt(index_account))//Printing balance amount
  }

  // Used to withdraw money from an account and function name is debit()
  def debit(): Unit = {
    var debit_amount: Int = 0//Declare variable
    println("Enter the account number were to withdraw")//Getting Account number
    val acc_num_debit = readInt()
    val index_debit = account_number.indexOf(acc_num_debit)// Indexing with particular account number
    println("Enter the amount you want to withdraw: ")
    debit_amount = readInt()
    balance_amt(index_debit) -= debit_amount//Reducing the amount and printing the results
    println("Money withdrawn successfully\n" +
      "Remaining balance is: " +
      balance_amt(index_debit))
  }
}


