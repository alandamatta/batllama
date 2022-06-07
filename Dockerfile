FROM openjdk:11
CMD mvn package
COPY ./target/batllama-1.jar app.jar
CMD pwd
CMD ls
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080