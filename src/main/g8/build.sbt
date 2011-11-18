import AndroidKeys._

organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(AndroidProject.androidSettings: _*)

platformName in Android := "android-$api_level$"

manifestPath in Android <<= (baseDirectory, manifestName in Android) map ((b, m) => Seq(b / m))

manifestTemplatePath in Android <<= (baseDirectory, manifestName in Android) (_ / _)

mainAssetsPath in Android <<= baseDirectory (_ / "assets")

mainResPath in Android <<= baseDirectory (_ / "res")