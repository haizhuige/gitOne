FROM java
VOLUME /tmp
ADD eureka-server-0.0.1-SNAPSHOT.jar  springdockerTest1.jar
RUN bash -c 'touch /springdockerTest1.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /springdockerTest1.jar" ]