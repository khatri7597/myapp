FROM java:8
copy ./target/myapp-0.0.1-SNAPSHOT.jar myapp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","myapp-0.0.1-SNAPSHOT.jar"]