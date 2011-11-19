[giter8](https://github.com/n8han/giter8) template for a basic [sbt](http://www.scala-sbt.org/) project for your Android apps.

This template is similar to the [android-app](https://github.com/jberkel/android-app.g8) template, with a couple of differences:

* your Android resources are in the root of the project to be compatible with the [ADT plug-in](http://developer.android.com/sdk/eclipse-adt.html) for Eclipse
* no separate `tests` project (yet) for Android integration tests
* [specs2](http://etorreborre.github.com/specs2/) support with [robospecs](https://github.com/jbrechtel/robospecs)

## Usage

Generate your Android project:

    g8 sdb/android-sbt-quick

The robospecs library version (0.2-SNAPSHOT) is not yet published so you'll need to build it yourself:

    git clone git://github.com/jbrechtel/robospecs.git
    cd robospecs
    sbt publish-local

## References

Check out the following resources for more information:

* the [wiki](https://github.com/harrah/xsbt/wiki) for simple build tool
* [android-plugin](https://github.com/jberkel/android-plugin) for information about how to test, package, run, ... your application
* unit testing your Android app with [Robolectric](http://pivotal.github.com/robolectric/)