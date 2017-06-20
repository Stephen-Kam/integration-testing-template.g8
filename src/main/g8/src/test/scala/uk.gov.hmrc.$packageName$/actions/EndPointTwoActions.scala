package uk.gov.hmrc.$packageName$.actions

import play.api.libs.json.JsValue
import play.api.libs.ws.WSResponse
import uk.gov.hmrc.$packageName$.support.Support

trait EndPointTwoActions extends Support {

  def getBing: WSResponse =
    client
      .url("http://www.bing.com")
      .get()
      .futureValue

  def postExample(url: String, data: JsValue): WSResponse =
    client
      .url(s"\$baseUrl/\$url")
      .withHeaders("Content-Type" -> "application/json")
      .post(data)
      .futureValue
}
