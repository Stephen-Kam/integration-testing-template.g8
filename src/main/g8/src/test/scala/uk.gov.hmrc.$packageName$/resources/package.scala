package uk.gov.hmrc.$packageName$

import scala.io.Source

import play.api.libs.json.Json

package object resources {

  def getFromSource(jsonFileName: String): JsValue = {
   Json.parse(Source.fromFile(s"src/test/scala/uk.gov.hmrc.$packageName$/resources/data/$jsonFileName.json").getLines.mkString)
  }
}