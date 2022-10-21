//This is the testcase to calculate the interest which is in savings account.

package Test_FundforFutureBank
import org.scalatest.funsuite.AnyFunSuite
import FundforFuture.{Account,DepositWithdraw,SavingsAccount,OpeningClosing}
class Interest_test extends AnyFunSuite{
  var interest= new SavingsAccount
  test("Check the Customer rate of interest") {
    assert(interest.calculate_interest(100) === 400)
  }
  var acc= new OpeningClosing
  test("Generate account number") {
    assert(acc.generate_account_number() === 1090)
  }

}