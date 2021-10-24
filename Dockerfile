FROM openjdk:8-jdk-alpine
MAINTAINER sf-express.com
COPY target/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]