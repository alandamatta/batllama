FROM openjdk:11
ARG JAR_FILE=target/*.jar
CMD mvn package
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080