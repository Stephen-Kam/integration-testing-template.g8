package uk.gov.hmrc.$packageName$.support

import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Millis, Seconds, Span}
import play.api.libs.json.Json
import play.api.libs.json.Json._
import play.api.libs.ws.ahc.AhcWSClient
import scala.concurrent.{ExecutionContext => Ec, ExecutionContextExecutor => Ece}
import uk.gov.hmrc.$packageName$.utils.Env
import play.api.http.Status

trait Support extends ScalaFutures with Env with Status {

  implicit override val patienceConfig = PatienceConfig(timeout = Span(5, Seconds), interval = Span(5, Millis))

  implicit val ec: Ece = Ec.global

  def prettify(json: String): Unit = prettyPrint(Json.parse(json))

  implicit val akkaSys: ActorSystem = ActorSystem.create()

  implicit val mat = ActorMaterializer()

  val client = AhcWSClient()

}
