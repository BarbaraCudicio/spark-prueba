organization := "com.algo"
name := "testspark"
scalaVersion := "2.11.12"

lazy val dependencyVersions = new {
  val spark = "2.3.2"
}

scalacOptions := Seq("-deprecation", "-unchecked", "-feature")


val providedDependencies = Seq(
  "org.apache.spark" %% "spark-core" % dependencyVersions.spark,
  "org.apache.spark" %% "spark-sql" % dependencyVersions.spark,
  "org.apache.spark" %% "spark-hive" % dependencyVersions.spark
) map (_ % "provided")

val dependencies = Seq(
  "org.apache.hadoop" % "hadoop-mapreduce-client-core" % "2.7.2",
  "org.apache.hadoop"%"hadoop-common"%"2.7.2",
  "commons-io"%"commons-io"%"2.4"
)

libraryDependencies ++=  providedDependencies ++ dependencies
dependencyOverrides ++= dependencies