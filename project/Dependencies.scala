import sbt._
import Keys._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.4"
  lazy val scalaCheck = "org.scalacheck" %% "scalacheck" % "1.13.5"
  lazy val parserCombinators = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6"
  lazy val kryoSerializers = "de.javakaffee" % "kryo-serializers" % "0.22"
  lazy val kryo = "com.esotericsoftware.kryo" % "kryo" % "2.20"
}
