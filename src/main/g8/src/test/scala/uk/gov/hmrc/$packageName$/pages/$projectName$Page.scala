package uk.gov.hmrc.$packageName$.pages

import org.scalatest.selenium.WebBrowser
import org.scalatest.{FlatSpec, Matchers}
import uk.gov.hmrc.$packageName$.pages.generic.WebPage

trait $projectName$Page extends FlatSpec with Matchers with WebBrowser with WebPage {

  override val url: String = ""

  override def back() = click on find(xpath(".//*[@class='back-link']")).get

  def buttonnext() = clickOn("ButtonNext")

  def submit() = clickOn("Submit")

  def continue() = click on find(xpath(".//*[@type='submit' and contains(text(),'Continue')]")).get

  def agreeAndContinue() = click on find(xpath(".//*[@type='submit' and contains(text(),'Agree and continue')]")).get

  def confirm() = click on find(xpath("//*[@value='Confirm']")).get

  def confirmPayment() = click on find(xpath(".//*[@type='submit' and contains(text(),'Confirm payments')]")).get

  def signIn() = click on find(xpath(".//*[@class='button ']")).get //TODO

  def recalculate() = click on find(xpath(".//*[@type='submit' and contains(text(),'Recalculate')]")).get


}
