package uk.gov.hmrc.$packageName$.pages.generic

import uk.gov.hmrc.$packageName$.pages.$projectName$Page

object NginxFailurePage extends $projectName$Page {

  // TODO find a better way to implement this, don't have the page source to hand right now
  override def isCurrentPage: Boolean = pageSource.contains("nginx")

}
