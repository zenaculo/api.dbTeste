FROM openjdk:17
ADD target/api-db-docker.jar api-db-docker.jar
ENTRYPOINT ["java", "-jar","api-db-docker.jar"]
EXPOSE 8080