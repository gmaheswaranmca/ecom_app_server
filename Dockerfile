# ---------- Build Stage ----------
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy only pom.xml first (to leverage Docker layer caching)
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Package the application (skip tests for faster build)
RUN mvn clean package -DskipTests

# ---------- Runtime Stage ----------
FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Copy only the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Render (or other cloud) sets $PORT dynamically
EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]

