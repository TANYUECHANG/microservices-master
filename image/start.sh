#！/bin/bash
nohup java -jar provider.jar & 
java -jar consumer.jar &
java -jar gateway.jar
