package uk.gov.hmrc.$packageName$.support

import play.api.libs.ws.WSResponse


trait EndPointOneActions extends Support {

  def getGoogle: WSResponse =
    client
      .url("http://www.google.com")
      .get()
      .futureValue
}
