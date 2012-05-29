
name := "google-step2-common"

organization := "com.gravitydev"
  
version := "0.0.1-SNAPSHOT"

autoScalaLibrary := false

crossPaths := false

libraryDependencies ++= Seq(
  "junit" % "junit" % "3.8.1" % "test",
  "javax.servlet" % "servlet-api" % "2.5",
  "com.google.guava" % "guava" % "12.0",
  "org.jdom" % "jdom" % "1.1",
  "commons-lang" % "commons-lang" % "2.3",
  "commons-io" % "commons-io" % "1.4",
  "nekohtml" % "nekohtml" % "1.9.6.2",
  "net.oauth.core" % "oauth-httpclient4" % "20090913",
  "net.oauth.core" % "oauth-consumer" % "20100527",
  "org.openid4java" % "openid4java-nodeps" % "0.9.6",
  "org.openxri" % "openxri-syntax" % "1.2.0" exclude("log4j", "log4j"),
  "org.openxri" % "openxri-client" % "1.2.0" exclude("log4j", "log4j"),
  "com.google.code.guice" % "guice" % "2.0",
  "aopalliance" % "aopalliance" % "1.0",
  "org.slf4j" % "slf4j-jcl" % "1.6.4",
  "org.apache.httpcomponents" % "httpcore" % "4.2",
  "org.apache.httpcomponents" % "httpclient" % "4.2"
)

resolvers ++= Seq(
  "oauth" at "http://oauth.googlecode.com/svn/code/maven",
  "sonatype" at "http://oss.sonatype.org/content/repositories/openid4java",
  "maven2-repository.dev.java.net" at "http://download.java.net/maven/2",
  "guice" at "http://guice-maven.googlecode.com/svn/trunk"
)

publishArtifact in (Compile, packageDoc) := false

