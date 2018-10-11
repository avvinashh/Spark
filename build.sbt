name := "sparksql"

version := "0.1"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.1.1",
  "org.apache.spark" %% "spark-sql" % "2.1.1",
  "org.apache.spark" %% "spark-catalyst" % "2.1.1" % Test)
