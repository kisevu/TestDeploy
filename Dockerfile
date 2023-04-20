FROM openjdk: 17
EXPOSE 8080
ADD target/ spring-boot-github-action-image.jar  spring-boot-github-action-image.jar
ENTRYPOINT ["java","-jar","/spring-boot-github-action-image.jar"]