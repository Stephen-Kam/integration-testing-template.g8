package uk.gov.hmrc.$packageName$.util

import org.openqa.selenium.WebDriver

trait ImplicitWebDriverSugar {
  implicit val webDriver: WebDriver = if (Env.withHar) Env.driverWithProxy else Env.driver

}