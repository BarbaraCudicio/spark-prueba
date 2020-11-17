organization := "com.algo"
name := "testspark"
scalaVersion := "2.11.12"

lazy val dependencyVersions = new {
  val spark = "2.4.1"
}

val dependencies = Seq(
  //"org.scala-lang" % "scala-compiler" % "2.11.8",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test",
  "com.typesafe" % "config" % "1.3.2"
)


val providedDependencies = Seq(
  "org.apache.spark" %% "spark-core" % dependencyVersions.spark,
  "org.apache.spark" %% "spark-sql" % dependencyVersions.spark,
  "org.apache.spark" %% "spark-hive" % dependencyVersions.spark
) map (_ % "provided")


libraryDependencies ++= dependencies ++ providedDependencies


