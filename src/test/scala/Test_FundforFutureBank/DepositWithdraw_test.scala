package Test_FundforFutureBank
import org.scalatest.funsuite.AnyFunSuite
import FundforFuture.{Account,DepositWithdraw,BankMain,CurrentAccount}
class DepositWithdraw_test extends AnyFunSuite {
  //
  test("withdrawal") {
    val withraw = new DepositWithdraw( 500)
    val result = withraw.withdraw(500)
    assert(withraw.getBalanceAmount == 0)
    assert(result.isLeft)
  }

  test("Deposit") {
    val dep = new DepositWithdraw(500)
    val result = dep.deposit(500)
    assert(dep.getBalanceAmount == 1000)
    assert(result.isLeft)
  }
}
