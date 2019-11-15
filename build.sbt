name := "ChatApp"

version := "0.1"

scalaVersion := "2.12.10"


// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.4.13" % Test

// https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.13"

// https://mvnrepository.com/artifact/com.typesafe.play/play
libraryDependencies += "com.typesafe.play" %% "play" % "2.7.3"