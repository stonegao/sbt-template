name := "sbt-template"

version := "0.1.0"

organization := "org.my" 

scalaVersion := "2.9.1"

testFrameworks += new TestFramework("org.specs2.runner.SpecsFramework")

resolvers ++= Seq("snapshots" at "http://scala-tools.org/repo-snapshots",
                  "releases"  at "http://scala-tools.org/repo-releases", 
                  "typesafe" at "http://repo.typesafe.com/typesafe/releases/", 
                  "central mvn repo" at "http://repo1.maven.org/",
                  "twitter.com" at "http://maven.twttr.com/", 
                  "Oracle Maven 2 Repository" at "http://download.oracle.com/maven", 
                  "JBoss Maven 2 Repository" at "http://repository.jboss.com/maven2"
                  )

libraryDependencies ++= {
  Seq(
    "org.specs2" %% "specs2" % "1.5" % "test",
    "org.specs2" %% "specs2-scalaz-core" % "6.0.1" % "test"
  ) 
}

parallelExecution in Test := false
