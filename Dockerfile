# Guru
FROM openjdk:11
ADD ./target/*.jar /usr/src/sb-docker-0.0.1.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "sb-docker-0.0.1.jar"]

# Spring Official
#FROM openjdk:8-jdk-alpine
##VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:11
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} sb-docker-1.jar
#ENTRYPOINT ["java","-jar","/sb-docker-1.jar"]

