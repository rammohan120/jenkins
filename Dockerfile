FROM adoptopenjdk/openjdk11:alpine-jre
ADD target/jenkins.jar jenkins.jar
ENTRYPOINT ["java","-jar","jenkins.jar"]