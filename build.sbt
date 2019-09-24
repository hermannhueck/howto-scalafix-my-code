val projectName = "howto-scalafix-my-code"

inThisBuild(
  Seq(
    name := projectName,
    scalaVersion := "2.13.1",
    version := "0.1.0-SNAPSHOT",
    scalafixDependencies ++= Seq(
      "com.github.vovapolu" %% "scaluzzi" % "0.1.2" // for rules 'MissingFinal' and 'Disable'
    ),
    publish / skip := true,
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8", // source files are in UTF-8
      "-deprecation", // warn about use of deprecated APIs
      "-unchecked", // warn about unchecked type parameters
      "-feature", // warn about misused language features
      "-Xlint", // enable handy linter warnings
      // "-Ypartial-unification", // not supported in scala 2.13.x
      "-Ywarn-unused"
      // "-Xfatal-warnings",        // turn compiler warnings into errors, conflicts with scalafixSemanticdb
    ),
    addCompilerPlugin(scalafixSemanticdb),
    scalacOptions += "-Yrangepos"
  )
)

addCommandAlias("check", "scalafix --check --stdout")
addCommandAlias("fix", "scalafix")
