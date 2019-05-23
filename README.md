# TechKafi #Sentry SpringBoot Backend Example

This Application is an example that shows the integration of Sentry in a Spring Boot application.

In this example we use the Spring Boot integration (https://docs.sentry.io/clients/java/integrations/#spring).

There are several different approaches on how to integrate Sentry in your Java applications. Check https://docs.sentry.io/clients/java/integrations/ for more details.

## Configure

* SENTRY_DSN: (https://[SECRET]@sentry.example.com/x), genereated URL from your Sentry installation
* SENTRY_ENVIRONMENT: (prod), Environment Filter of the given instance

## Build
 
```
mvn clean install
```

## Run

```
export SENTRY_DSN=https://[SECRET]@sentry.example.com/x
export SENTRY_ENVIRONMENT=test
java -jar target/sentry-techkafi-backend-0.0.1-SNAPSHOT.jar
```

## Test

access http://localhost:8080/api/get or send a post Request to http://localhost:8080/api/post