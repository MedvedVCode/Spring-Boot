FROM openjdk:17-jdk-alpine

EXPOSE 8081

ADD build/libs/SpringApp-0.0.1-SNAPSHOT.jar devprod.jar

ENTRYPOINT ["java","-jar","devprod.jar"]