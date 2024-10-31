FROM openjdk:21-jdk-slim

WORKDIR /app

COPY src/main/java/org/jrevolorio/api /app/org/jrevolorio/api

RUN javac /app/org/jrevolorio/api/Main.java

CMD ["java", "-cp", "/app", "org.jrevolorio.api.Main"]