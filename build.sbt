name := "Goose"

version := "1.0.0"

organization := "co.andrewladd.goose"

description := "Extracts text, metadata, and key image from web articles."

licenses += "Apache2" -> url("http://www.apache.org/licenses/")

// scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies ++= Seq(
    "junit"                     % "junit"         % "4.8.1" % "test",
    "org.slf4j"                 % "slf4j-api"     % "1.6.1" % "compile",
    "org.slf4j"                 % "slf4j-log4j12" % "1.6.1" % "test",
    "org.slf4j"                 % "slf4j-simple"  % "1.6.1",
    "org.jsoup"                 % "jsoup"         % "1.7.3",
    "commons-io"                % "commons-io"    % "2.0.1",
    "org.apache.httpcomponents" % "httpclient"    % "4.1.3",
    "commons-lang"              % "commons-lang"  % "2.6",
    
    "org.scala-lang"            % "scala-compiler" % "2.10.1",
    "org.scala-lang"            % "scala-library" % "2.10.1"
)
