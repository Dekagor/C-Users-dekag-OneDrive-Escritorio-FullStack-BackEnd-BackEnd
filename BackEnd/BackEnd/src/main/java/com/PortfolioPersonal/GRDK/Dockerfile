
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

#FROM alpine:latest
#CMD ["/bin/sh"]

FROM amazoncorretto:11-alpine-jdk

MAINTAINER GRDK

copy target/GRDK-0.0.1-SNAPSHOT.jar GRDK-app.jar

ENTRYPOINT ["java", "-jar", "/GRDK-app.jar"]