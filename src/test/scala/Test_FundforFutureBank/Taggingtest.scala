package testpackage

import org.scalatest.Tag
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.tagobjects.Slow
import FundforFuture.DepositWithdraw

object Super extends Tag("com.training.learning.practise.codetotest.Super")

class TaggingTest  extends AnyFlatSpec{
  "The Scala language" must "add correctly syntax" taggedAs (Slow) in {
    var dep =new DepositWithdraw(10)
    //val amount =100
    //val bal_amt =0

    assert(dep.deposit(10) === 10)
  }
  it must "Withdraw" taggedAs(Slow,Super) in{
    var dep1 =new DepositWithdraw(10)
    assert(dep1.withdraw(0) === 0)
  }
}