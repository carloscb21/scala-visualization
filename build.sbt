/*
 * The original author is CCB, 2020.
 */

name := "scala-visualization"

version := "0.1"

scalaVersion := "2.11.12"

//set scala-visualization / Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.ScalaLibrary
//set scala-visualization / Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat

//lazy val testingSetting = Seq(
//  fork in Test := false,
//  parallelExecution in Test := false,
////  javaOptions in Test ++= Seq("-Xms2024m", "-Xmx6096m", "-XX:MaxPermSize=6096M", "-XX:+CMSClassUnloadingEnabled")
//  // coverageHighlighting := true,
//  // coverageMinimum := 80,
//  // coverageFailOnMinimum := false
//)
//fork in Test := false
//Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.ScalaLibrary
//Test / classLoaderLayeringStrategy := ClassLoaderLayeringStrategy.Flat

lazy val osName = System.getProperty("os.name") match {
  case n if n.startsWith("Linux")   => "linux"
  case n if n.startsWith("Mac")     => "mac"
  case n if n.startsWith("Windows") => "win"
  case _ => throw new Exception("Unknown platform!")
}

lazy val javaFXModules = Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")

lazy val circeVersion = "0.7.0"

libraryDependencies ++= Seq(
  "org.vegas-viz" %% "vegas" % "0.3.11",
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "com.github.julien-truffaut" %% "monocle-macro" % (scalaBinaryVersion.value match {
    case "2.11" => "1.1.0"
    case "2.12" => "1.3.2"
  }),
  "com.github.julien-truffaut" %% "monocle-core" % (scalaBinaryVersion.value match {
    case "2.11" => "1.1.0"
    case "2.12" => "1.3.2"
  }),
  "org.scalafx" %% "scalafx" % "12.0.2-R18",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6",

  // Test deps
  "com.github.aishfenton" %% "argus" % "0.2.7" % "test",
  "org.scalactic" %% "scalactic" % "3.0.5" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "3.13.0" % "test"
) ++ javaFXModules.map( m =>
  "org.openjfx" % s"javafx-$m" % "11" classifier osName
)

//libraryDependencies += "org.openjfx" % "javafx" % "11" pomOnly()
//libraryDependencies += "org.vegas-viz" %% "vegas" % "0.3.11"
//libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.4"
//libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.3.4"
//libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.3.4" % "provided"
////libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.4" % "runtime"
//libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.4"
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
//libraryDependencies += "org.mockito" % "mockito-all" % "1.9.5" % "test"
//libraryDependencies += "org.scoverage" %% "scalac-scoverage-plugin" % "1.4.0"

scalacOptions += "-target:jvm-1.8"



