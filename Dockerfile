FROM maven:3.6.3-jdk-8 AS MAVEN_BUILD
COPY ./ ./
# package our application code
RUN mvn clean package
# the second stage of our build will use open jdk 8 on alpine 3.9
FROM openjdk:8
# copy only the artifacts we need from the first stage and discard the rest
COPY --from=MAVEN_BUILD /target/*.jar sb-docker.jar
 # set the startup command to execute the jar
#CMD ["java", "-jar", "/demo.jar"]
ENTRYPOINT ["java","-jar", "sb-docker.jar"]

# Spring Official
#FROM openjdk:8-jdk-alpine
##VOLUME /tmp
#COPY target/*.jar app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]

#FROM openjdk:11
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} sb-docker-1.jar
#ENTRYPOINT ["java","-jar","/sb-docker-1.jar"]