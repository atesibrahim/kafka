FROM openjdk:17-jdk-slim-buster
ARG JAR_FILE=target/kafka.jar
WORKDIR /opt/app
COPY target/kafka-1.0.0.jar /kafka-docker.jar
ENTRYPOINT ["java","-jar","/kafka-docker.jar"]