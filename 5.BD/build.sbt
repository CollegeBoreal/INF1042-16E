name := "BD"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = project in file(".")

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
    