package uk.gov.hmrc.$packageName$.tests

import uk.gov.hmrc.$packageName$.support.{Actions, IntegrationSpec}
import uk.gov.hmrc.$packageName$.tags.RunOnlyInDev

class MainSpec extends IntegrationSpec with Actions {

  feature("An example feature") {
    scenario("An example scenario", RunOnlyInDev) {
      When("I visit the Google site")
      val response = getGoogle

      Then("The response status should be 200")
      response.status shouldBe 200
    }

    scenario("Another example scenario", RunOnlyInDev) {
      When("I visit the bing site")
      val response = getBing

      Then("The response status should be 200")
      response.status shouldBe 200
    }
  }
}

