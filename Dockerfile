# Use a base image with Java installed
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at /app
COPY target/*.jar /app/app.jar

# Specify the command to run your application when the container starts
CMD ["java", "-jar", "app.jar"]
