FROM openjdk:8
ADD target/dockerapp.jar dockerapp.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","dockerapp.jar"]