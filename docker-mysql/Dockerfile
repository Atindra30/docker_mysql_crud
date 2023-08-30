FROM openjdk:17
EXPOSE 8080
ADD target/docker-mysql.jar docker-mysql.jar
ENTRYPOINT [ "java", "-jar", "docker-mysql.jar" ]