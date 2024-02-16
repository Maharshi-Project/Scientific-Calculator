FROM openjdk:17
COPY ./target/calculator-0.0.1-SNAPSHOT.jar.original ./
WORKDIR ./
CMD ["java","-jar","calculator-0.0.1-SNAPSHOT.jar.original","main"]