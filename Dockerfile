FROM java

LABEL maintainer Mayuresh Krishna <mayureshkrishna@gmail.com>

EXPOSE 8080

VOLUME /opt

ADD /demo-1.0.5.jar /app.jar

ENTRYPOINT exec java -Dspring.config.name=myapp -Dspring.config.location=/opt/myapp.properties -jar /app.jar

