#FROM openjdk:11
#ADD ./target/sb-docker-1-0.0.1.jar /usr/src/sb-docker-1-0.0.1.jar
#WORKDIR usr/src
#ENTRYPOINT ["java","-jar", "sb-docker-1-0.0.1.jar"]

FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sb-docker-1.jar
ENTRYPOINT ["java","-jar","/sb-docker-1.jar"]