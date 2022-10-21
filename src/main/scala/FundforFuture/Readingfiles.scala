package FundforFuture

import scala.io.Source

class Readingfiles {
 def fileread(){
  val over_file = "C:\\Users\\nimmy\\OneDrive\\Desktop\\Fundforfuture\\Basic Understanding of UK banking.rtf"

  for(over <- Source.fromFile(over_file).getLines) {
    println(over)
  }
  }

}
