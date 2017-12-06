FROM java
LABEL maintainer Mayuresh Krishna <mayureshkrishna@gmail.com>
EXPOSE 8080
VOLUME /tmp
ADD demo-1.0.5-SNAPSHOT.jar \App.jar
ENTRYPOINT ["java", "-Dspring.config.location=\opt\props\dev\application.properties", "-jar", "/demo-1.0.5-SNAPSHOT.jar"]
