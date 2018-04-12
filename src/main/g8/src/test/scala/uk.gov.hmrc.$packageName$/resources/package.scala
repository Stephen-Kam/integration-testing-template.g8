package uk.gov.hmrc.$packageName$

import scala.io.Source

import play.api.libs.json.Json


package object resources {

  val sample = Json.parse(Source.fromFile(s"src/test/scala/uk.gov.hmrc.$packageName$/resources/data/sample.json").getLines.mkString)
}
