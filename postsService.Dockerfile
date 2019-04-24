FROM maven:3.6.1-jdk-8-alpine AS buildstage
WORKDIR /postservice
COPY friendbookpost .
RUN mvn package

FROM openjdk:8-jre-alpine3.9
WORKDIR /postsserviceapp
COPY --from=buildstage /postservice/target/friendbookpost-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar friendbookpost-0.0.1-SNAPSHOT.jar