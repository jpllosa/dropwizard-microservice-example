# Dockerfile for dropwizard-microservice in docker image
FROM java:latest
MAINTAINER joel patrick llosa
WORKDIR .
EXPOSE 8080
ADD dropwizard-microservice-example-0.0.1-SNAPSHOT.jar .
CMD ["java", "-jar", "dropwizard-microservice-example-0.0.1-SNAPSHOT.jar", "server"]
# take note of the ip address when opening docker terminal
# to build the image file: docker build -t dropndock .
# to run: docker run -P --rm dropndock
# find the port: docker ps
# call the log service: curl http://docker.ip.address:docker-port/log?m=message&s=stacktrace

