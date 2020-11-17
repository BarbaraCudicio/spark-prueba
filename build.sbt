organization := "com.algo"
name := "testspark"
scalaVersion := "2.11.12"


libraryDependencies ++= Seq(
  "org.apache.spark"              %% "spark-core"                        % "2.3.1"  % "provided",
  "org.apache.spark"              %% "spark-sql"                         % "2.3.1"  % "provided",
  "org.apache.spark"              %% "spark-mllib"                       % "2.3.1"  % "provided"
)
