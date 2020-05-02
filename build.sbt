//scalaVersion := "2.12.10"
scalaVersion := "2.13.1"
version := "0.2.14"

organization := "com.billding"

enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "com.lihaoyi" %%% "scalatags" % "0.8.6",
  "org.scala-js" %%% "scalajs-dom" % "1.0.0",
)

githubOwner := "swoogles"
githubRepository := "BulmaScala"
