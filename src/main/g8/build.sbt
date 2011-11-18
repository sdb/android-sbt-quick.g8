organization := "$organization$"

name := "$name$"

version := "$version$"

scalaVersion := "$scala_version$"

seq(AndroidProject.androidSettings: _*)

platformName in Android := "android-$api_level$"

manifestPath in Android <<= (baseDirectory, manifestName in Android) (_ / _)

manifestTemplatePath in Android <<= (manifestPath in Android) (mp => mp)

mainAssetsPath in Android <<= baseDirectory (_ / "assets")

mainResPath in Android <<= baseDirectory (_ / "res")