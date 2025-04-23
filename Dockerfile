# Use the official Maven image as the base image
FROM maven:3.8-openjdk-17 AS build

# Copy the project files into the container
COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim

COPY --from=build /target/customer-relationship-management-0.0.1-SNAPSHOT.jar customer-relationship-management-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","customer-relationship-management-0.0.1-SNAPSHOT.jar"]

