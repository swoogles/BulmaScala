//scalaVersion := "2.12.10"
scalaVersion := "3.3.1"
version := "0.2.22"

organization := "com.billding"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "com.lihaoyi" %%% "scalatags" % "0.12.0",
  "org.scala-js" %%% "scalajs-dom" % "2.6.0",
)

githubOwner := "swoogles"
githubRepository := "BulmaScala"
