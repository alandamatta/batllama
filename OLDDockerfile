FROM openjdk:11
CMD mvn package
CMD pwd
CMD ls
COPY ./target/batllama-1.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
EXPOSE 8080