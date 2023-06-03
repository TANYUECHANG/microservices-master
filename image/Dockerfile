FROM openjdk:8-jdk-alpine
WORKDIR /app
ADD common-0.0.1-SNAPSHOT.jar /app/common.jar
ADD consumer-0.0.1-SNAPSHOT.jar /app/consumer.jar
ADD provider-0.0.1-SNAPSHOT.jar /app/provider.jar
ADD gateway-0.0.1-SNAPSHOT.jar /app/gateway.jar
ADD start.sh /app/start.sh
RUN chmod 777 /app/start.sh
ENTRYPOINT ["sh","-c","/app/start.sh"]

