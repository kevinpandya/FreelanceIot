name := """FreeLancelot"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.6"

libraryDependencies += guice

libraryDependencies += ehcache

libraryDependencies += "org.mockito" % "mockito-core" % "4.0.0" % Test

libraryDependencies += "org.powermock" % "powermock-module-junit4" % "2.0.9" % Test

libraryDependencies += "org.powermock" % "powermock-api-mockito2" % "2.0.9" % Test