ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaRepo"
  )

val scalatestVersion = "3.2.17"

libraryDependencies ++= Seq(
  //testing
  "org.scalatest" %% "scalatest" % scalatestVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",
  "com.mysql" % "mysql-connector-j" % "8.2.0"
)