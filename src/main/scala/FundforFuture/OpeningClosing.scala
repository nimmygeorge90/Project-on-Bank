package FundforFuture
import scala.io.StdIn.{readInt, readLine}

  class opening_closing extends Account
  {

    // Method to open an account
    def opening(): Unit ={

      // readLine() method is used to
      // take a string as input from user
      var new_name = readLine("Enter the name: ")
      //first_name += new_name
      println("Enter the opening balance: ")
      var opening_balance = readInt()
      balance_amt += opening_balance
      account_number += 1908
      println("Account added successfully")
    }

    // Method used to close an existing account
    def closing(): Unit ={
      println("Enter the account number: ")
      val acc_num6 = readInt()
      val index6 = account_number.indexOf(acc_num6)
      //first_name -= first_name(index6)
      balance_amt -= balance_amt(index6)
      account_number -= account_number(index6)
      println("Account removed successfully")
    }

}
object op_cl extends App {
  var open_close = new opening_closing
  open_close.opening()
  open_close.closing()
}