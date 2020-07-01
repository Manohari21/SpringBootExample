FROM openjdk:8
ADD target/spring-boot-kube.jar spring-boot-kube.jar
ENTRYPOINT ["java","-jar", "/spring-boot-kube.jar"]