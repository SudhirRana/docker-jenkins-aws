FROM openjdk:11
COPY target/Docker-Jenkins-AWS-0.0.1-SNAPSHOT.jar Docker-Jenkins-AWS-0.0.1-SNAPSHOT.jar
CMD java -jar Docker-Jenkins-AWS-0.0.1-SNAPSHOT.jar