# The base image
FROM openjdk:17

# Copy the jar file from local system to the docker image
COPY ./target/java-calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./

# The current working directory
WORKDIR ./

# This command will be executed when the container starts
CMD ["java", "-jar", "java-calculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar"]

# use the command 'docker run -i -t <image>' to run the container