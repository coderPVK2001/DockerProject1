FROM openjdk:17

COPY target/dockerproject1.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 8090

ENTRYPOINT ["java", "-jar", "devops-app.jar"]
