FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/web-app-0.0.1-SNAPSHOT.jar app.j
ENTRYPOINT ["java", "-jar", "app.jar"]ar
