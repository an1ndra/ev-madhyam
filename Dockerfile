FROM openjdk:17
EXPOSE 8080
ADD target/EvMadhyamApplication.jar EvMadhyamApplication.jar
ENTRYPOINT ["java","jar","/EvMadhyamApplication" ]