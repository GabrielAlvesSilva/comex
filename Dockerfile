FROM openjdk:8u342-jdk
WORKDIR /comex/comexws
EXPOSE 8080
COPY comex.jar .
ENTRYPOINT java -jar comex.jar