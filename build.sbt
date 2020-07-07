/*
 * The original author is CCB, 2020.
 */

name := "scala-visualization"

version := "0.1"

scalaVersion := "2.11.12"

//set scala-visualization / Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.ScalaLibrary
//set scala-visualization / Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat

lazy val testingSetting = Seq(
  fork in Test := false,
  parallelExecution in Test := false,
//  javaOptions in Test ++= Seq("-Xms2024m", "-Xmx6096m", "-XX:MaxPermSize=6096M", "-XX:+CMSClassUnloadingEnabled")
  // coverageHighlighting := true,
  // coverageMinimum := 80,
  // coverageFailOnMinimum := false
)
Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.ScalaLibrary
Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat

libraryDependencies += "org.openjfx" % "javafx" % "11" pomOnly()
libraryDependencies += "org.vegas-viz" %% "vegas" % "0.3.11"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.4"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.4" % "provided"
//libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.4" % "runtime"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5" % "test"
libraryDependencies += "org.scoverage" %% "scalac-scoverage-plugin" % "1.4.0"

scalacOptions += "-target:jvm-1.8"



