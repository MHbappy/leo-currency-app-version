#RUN ./create-package.sh
FROM openjdk:11
VOLUME /tmp
ADD target/app-version_server-0.0.1-SNAPSHOT.jar app-version_server-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app-version_server-0.0.1-SNAPSHOT.jar", "-Dspring.profiles.active=prod"]