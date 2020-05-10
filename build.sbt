/*
 * The original author is CCB, 2020.
 */

import sbt.Keys.mainClass

name := "scala-visualization"

version := "0.1"

scalaVersion := "2.11.12"

lazy val testingSetting = Seq(
  fork in Test := false,
  parallelExecution in Test := false,
  javaOptions in Test ++= Seq("-Xms2024m", "-Xmx6096m", "-XX:MaxPermSize=6096M", "-XX:+CMSClassUnloadingEnabled")
  // coverageHighlighting := true,
  // coverageMinimum := 80,
  // coverageFailOnMinimum := false
)

libraryDependencies += "org.vegas-viz" %% "vegas" % "0.3.11"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.4"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.4"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.4" % "provided"
//libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.4" % "runtime"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5" % "test"
libraryDependencies += "org.scoverage" %% "scalac-scoverage-plugin" % "1.4.0"
//scalacOptions ++= Seq(
//  "-g:none"
//)

scalacOptions += "-target:jvm-1.8"
//test in assembly := {},
//mainClass in assembly := Some(""),
//assemblyJarName in assembly := "",
//assemblyMergeStrategy in assembly := {
//  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
//  case x => MergeStrategy.first
//}


