FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./target/demo.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar", "&"]