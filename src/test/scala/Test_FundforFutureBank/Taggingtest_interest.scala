package Test_FundforFutureBank

import org.scalatest.Tag
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.tagobjects.Slow
class Taggingtest_interest extends AnyFlatSpec {

  object Super extends Tag("scala.FundforFuture.SavingsAccount.Super")

  class TaggingTestInterestAmount extends AnyFlatSpec {
    "The Scala language" must "add correctly syntax" taggedAs (Slow) in {
      val interestAmount = (40000 * 2) / 100
      assert(interestAmount === 800)
    }
  }
}