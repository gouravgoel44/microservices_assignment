FROM openjdk:8-jre-alpine
ENV APP_FILE UserService-0.0.1-SNAPSHOT.jar
EXPOSE 8000
COPY target/$APP_FILE .
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]