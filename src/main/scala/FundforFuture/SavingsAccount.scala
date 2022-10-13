package FundforFuture
import scala.io.StdIn.{readInt, readLine}

  class SavingsAccount extends Account {
    var interest: Double = 2

    // Method used to calculate interest
    def interest_amount(): Unit = {
      println("Enter the account number " +
        "to see the interest amount: ")
      val acc_num3 = readInt()
      val index3 = account_number.indexOf(acc_num3)
      interest = (balance_amt(index3) * 2) / 100
      println("The interest amount is: " + interest)
    }

}

object savings extends App{
  var sav_obj= new SavingsAccount
  sav_obj.interest_amount()

    }
