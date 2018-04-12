package uk.gov.hmrc.$packageName$.utils

trait Env {

  val environmentProperty = Option(System.getProperty("environment", "local"))

  val baseUrl: String = environmentProperty match {
    case Some("local") => ""
    case Some("dev") => "https://www.dev.tax.service.gov.uk"
    case Some("qa") => "https://www.qa.tax.service.gov.uk"
    case Some("staging") => "https://www.staging.tax.service.gov.uk"
    case _ => throw new IllegalArgumentException(s"Environment '\$environmentProperty' not known")
  }
}