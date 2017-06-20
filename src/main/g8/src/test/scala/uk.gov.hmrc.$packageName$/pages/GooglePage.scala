package uk.gov.hmrc.$packageName$.pages

import uk.gov.hmrc.$packageName$.pages.generic.BasePage

object GooglePage extends BasePage {

//  override val url = ""

  def navigateToGoogle(): Unit = go to "https://www.google.co.uk"
}
