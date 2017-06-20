package uk.gov.hmrc.$packageName$.tests

import uk.gov.hmrc.$packageName$.pages.GooglePage
import uk.gov.hmrc.$packageName$.tags.RunOnlyInDev


class MainSpec extends BaseFeatureSpec {

  feature("Some feature") {
    scenario("Some scenario", RunOnlyInDev) {
      Given("I am on the Google home page")
      GooglePage.navigateToGoogle()
    }
  }
}
