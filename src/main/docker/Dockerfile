FROM openjdk:8-jdk-alpine
RUN mkdir -p /server
ADD @project.build.finalName@.jar /server/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh
