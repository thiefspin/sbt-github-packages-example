import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-github-packages-example",
    githubOwner := "thiefspin",
    githubRepository := "sbt-github-packages-example",
    githubTokenSource := TokenSource.GitConfig("github.token"),
//    credentials ++= Seq(
//      Credentials(
//        "GitHub Package Registry",
//        "maven.pkg.github.com",
//        sys.env.getOrElse("GITHUB_USERNAME", "N/A"),
//        sys.env.getOrElse("GITHUB_TOKEN", "N/A")
//      )
//    ),
    libraryDependencies += scalaTest % Test
  )
