package uk.gov.hmrc.$packageName$.tests

import uk.gov.hmrc.$packageName$.actions.Actions
import uk.gov.hmrc.$packageName$.support.IntegrationSpec
import uk.gov.hmrc.$packageName$.tags.RunOnlyInDev
import uk.gov.hmrc.$packageName$.resources._

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

    Scenario("Example POST") {
      When("I post to a site")
      val foo = postExample("", sample)

      Then("The response status will be OK")
      foo.status shouldBe OK
    }
  }
}

