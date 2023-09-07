# Spring Boot 3 API with ReDoc Documentation

## Introduction

This project is a simple Spring Boot 3 API that serves as an example of how to integrate [ReDoc](https://github.com/Redocly/redoc) to automatically generate interactive API documentation for your Spring Boot application. The API is built using Java 17 and Spring Boot, making use of standard RESTful practices.

ReDoc is a powerful tool for creating visually appealing and interactive documentation for your APIs. With ReDoc, you can easily share API documentation with your team or external developers, making it easier to understand and use your APIs.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java 17 installed. You can download it from [OpenJDK](https://jdk.java.net/17/).
- Gradle installed. You can download it from [Gradle](https://gradle.org/install/).
- Git installed for version control.

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository to your local machine:

```bash
git clone https://github.com/amine-hamzi/open-api-demo.git
```

2. Navigate to the project directory:

```bash
cd open-api-demo
```

## Running the Application

To run the Spring Boot application, use the following Gradle command:

```bash
./gradlew bootRun
```

The application will start, and you can access it at `http://localhost:8080`.

## Accessing API Documentation

The API documentation is generated using ReDoc and is accessible at:

```
http://localhost:8080/index.html or http://localhost:8080/
```

You can explore the endpoints, make test requests, and understand the API's functionality through the interactive documentation.

## Built With

- [Spring Boot 3](https://spring.io/projects/spring-boot) - The web framework used.
- [Java 17](https://openjdk.java.net/projects/jdk/17/) - The programming language.
- [ReDoc](https://github.com/Redocly/redoc) - Used for API documentation generation.
- [Gradle](https://gradle.org/) - Build tool used for the project.

## Contributing

Contributions are welcome! If you'd like to contribute to this project, please follow these guidelines:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes and push them to your fork.
4. Submit a pull request with a clear description of your changes.

---

Feel free to reach out if you have any questions or need further assistance. Happy coding!
