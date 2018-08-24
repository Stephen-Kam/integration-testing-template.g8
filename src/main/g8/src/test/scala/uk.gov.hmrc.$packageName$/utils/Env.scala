package uk.gov.hmrc.$packageName$.utils

trait Env {

  val environmentProperty = Option(System.getProperty("environment", "local"))

  val baseUrl: String = environmentProperty match {
    case Some("local") => ""
    case Some("dev") => "https:"
    case Some("qa") => "https:"
    case Some("staging") => "https:"
    case _ => throw new IllegalArgumentException(s"Environment '\$environmentProperty' not known")
  }
}