package uk.gov.hmrc.$packageName$.support

import java.util.UUID

import org.scalatest.concurrent.{Eventually, ScalaFutures}
import org.scalatest._
import play.api.http.Status

trait IntegrationSpec extends FeatureSpec
  with GivenWhenThen
  with ScalaFutures
  with Matchers {
}
