name := "$name$"

version := "0.0.1"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.0" % "test",
  "org.pegdown" % "pegdown" % "1.6.0" % "test"
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports/html-report")
