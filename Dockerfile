FROM openjdk:21-jdk
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/employee-0.0.1-SNAPSHOT.jar
ENTRYPOINT exec java $JAVA_OPTS -jar employee-0.0.1-SNAPSHOT.jar