FROM openjdk:14-alpine
COPY target/micronaut-example-java-engie-*.jar micronaut-example-java-engie.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "micronaut-example-java-engie.jar"]