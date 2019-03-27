FROM openjdk:8u191-jre-alpine3.9
WORKDIR /src
COPY ./target/demo.jar /src/demo.jar
EXPOSE 8080
CMD ["java" "-jar", "demo.jar"]