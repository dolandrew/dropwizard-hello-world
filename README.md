# Dropwizard Hello World

The Dropwizard example application was developed to, as its name implies, provide examples of some of the features
present in Dropwizard. It can be found [here](https://github.com/dropwizard/dropwizard/tree/release/4.0.x/dropwizard-example).

This particular repository is a minified version of the official Dropwizard example program. It is designed to contain
only a simple endpoint at root (http://localhost:8080) that returns "Hello world!"


## 1. Build the application

with Gradle

      ./gradlew build

with Maven

      ./mvnw package

## 2. Run the application 

with Gradle

      ./gradlew run

   as a JAR

      java -jar build/libs/hello-world-all.jar server config.yml

## 3. Navigate to endpoint

      http://localhost:8080
