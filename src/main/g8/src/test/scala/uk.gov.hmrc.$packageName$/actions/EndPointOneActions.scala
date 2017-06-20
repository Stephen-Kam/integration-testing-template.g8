package uk.gov.hmrc.$packageName$.actions

import play.api.libs.ws.WSResponse
import uk.gov.hmrc.$packageName$.support.Support

trait EndPointOneActions extends Support {

  def getGoogle: WSResponse =
    client
      .url("http://www.google.com")
      .get()
      .futureValue
}
