package uk.gov.hmrc.$packageName$

import scala.io.Source

package object resources {

  val sample = Json.parse(Source.fromFile(s"src/test/scala/uk.gov.hmrc.$packageName$/resources/data/sample.json").getLines.mkString)
}
