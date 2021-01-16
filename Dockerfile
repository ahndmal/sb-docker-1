FROM maven:3.6.3-jdk-11
# copy the source tree and the pom.xml to our new container
COPY ./ ./
# package our application code
RUN mvn clean package
# set the startup command to execute the jar
#CMD ["java", "-jar", "target/demo-0.0.1-SNAPSHOT.jar"]

FROM openjdk:11
#ADD ./target/*.jar /usr/src/sb-docker-0.0.1.jar
#WORKDIR usr/src
ENTRYPOINT ["java","-jar", "target/sb-docker-0.0.1.jar"]

# Spring Official
#FROM openjdk:8-jdk-alpine
##VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:11
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} sb-docker-1.jar
#ENTRYPOINT ["java","-jar","/sb-docker-1.jar"]

