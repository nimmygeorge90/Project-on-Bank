package Test_FundforFutureBank

import org.scalatest.wordspec.AnyWordSpec

import scala.collection.mutable.ListBuffer
import FundforFuture.{Account}
class AnywordSpec_list extends AnyWordSpec {
  def listbu=new Account
  "Testing"should{
    "be easy"in{
      assert(listbu.names.isEmpty)
      listbu.names += "Nimmy"
    }
    "be fun"in{
      assert(listbu.names.isEmpty)
    }
  }
}