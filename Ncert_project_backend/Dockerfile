# Use the official Maven image as a base
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven project definition and pom.xml file into the container
COPY pom.xml .

# Download dependencies specified in pom.xml
RUN mvn dependency:go-offline -B

# Copy the rest of the application code into the container
COPY src ./src

# Build the application
RUN mvn package

# Create a new lightweight container for the Spring Boot application
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file from the previous build stage into the container
COPY --from=build /app/target/*.jar app.jar

# Expose the port that the Spring Boot application runs on
EXPOSE 8080

# Start the Spring Boot application
CMD ["java", "-jar", "app.jar"]
