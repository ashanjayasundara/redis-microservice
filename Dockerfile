FROM maven:3.8.4-jdk-8
WORKDIR /usr/msc/app
RUN mvn clean install package
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]