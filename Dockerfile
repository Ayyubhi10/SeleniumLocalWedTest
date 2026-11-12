
FROM markhobson/maven-chrome:jdk-17

WORKDIR /app

COPY pom.xml .
COPY testing.xml .
COPY src ./src

CMD ["mvn", "-B", "clean", "test", "-Dsurefire.suiteXmlFiles=testing.xml"]
