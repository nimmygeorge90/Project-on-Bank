package FundforFuture
import scala.io.StdIn.{readInt, readLine}
object bank_main extends App{


      // Object of all classes
      val obj0 = new LoginPage()
      val obj1 = new Account()
      val obj2 =new AddRemove()
      val obj3 = new SavingsAccount()
      val obj4 = new CurrentAccount()
      val obj5 = new opening_closing()
      val log_user = obj0.login()
      println(log_user)
      //val account = obj1.get_account(log("index"))

      println("Enter 1 for account details, " +
        "2 for SavingsAccount, " +
        "3 for CurrentAccount and " +
        "4 for closing or opening account")

      val choice = readInt()
  if (choice == 1) {
        obj1.show_account_details()
      }

      if (choice == 2) {
        println("Enter 1 for checking the interest " +
          "amount and 2 if you want to see the " +
          "details of any particular account: ")

        val choice1 = readInt()
        if (choice1 == 1) {
          obj3.interest_amount()
        }
        else if (choice == 2) {

        }
      }

      if (choice == 3) {
        println("Enter 1 for credit and 2 for debit: ")
        val choice2 = readInt()

        if (choice2 == 1) {
          obj2.credit()
        }
        if (choice2 == 2) {
          obj2.debit()
        }
      }

      if (choice == 4) {
        println("Enter 1 for opening account " +
          "and 2 for closing an account: ")

        val choice3 = readInt()
        if (choice3 == 1) {
          obj5.opening()
        }
        else {
          obj5.closing()
        }
      }
}
