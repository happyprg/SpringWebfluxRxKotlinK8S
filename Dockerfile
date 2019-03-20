FROM openjdk:8-jdk-alpine

RUN apk add --update \
    curl \
    wget \
    && rm -rf /var/cache/apk/*

EXPOSE 8080
ADD /build/libs/checker-0.0.1-SNAPSHOT.jar checker.jar
ENTRYPOINT ["java", "-jar", "checker.jar"]