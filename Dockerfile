FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/devops-application.jar devops-application.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "devops-application.jar"]