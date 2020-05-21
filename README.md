# Template for Spring Boot project using Kotlin and Crnk

This repository contains a minimal implementation for a Spring-based application that shows the 
interaction between the JVM language [Kotlin](https://kotlinlang.org/) and the resource-oriented 
REST library [Crnk](https://github.com/crnk-project/). It serves the purpose of extending the Crnk 
integration examples which you can find [here](https://github.com/crnk-project/crnk-framework/tree/master/crnk-integration-examples).

## Getting Started

### Requirement

Crnk requires Java 8 or later.

### Building and running the application

Building the project can be achieved by running this command in the project directory:
```
./gradlew build
```
After starting the application with 
```
./gradlew bootRun
```
the endpoints can be accessed on
```
http://localhost:8080/
```

### Integration with IntelliJ IDEA

Alternatively, after cloning this repository you can import the project into your IDE by
```
File > New > Project from Existing Sources > {Choose directory and Gradle as Build Tool}
```

## Additional Resources

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/gradle-plugin/reference/html/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

