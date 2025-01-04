# Base image for Java
FROM openjdk:23-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the application JAR file
COPY target/organization-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your app runs on
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
