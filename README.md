# todo-api
TODO api with CRUD endpoints
# Spring Boot TODO API

A REST API built with Spring Boot for managing TODO.

## Technologies Used
- Java 20
- Spring Boot 3.5.11
- Spring Security + JWT
- Spring Data JPA
- MySQL
- Lombokgit
- Maven

## Features
- Todo CRUD API
- Input Validation
- Exception Handling

## How to Run
1. Clone the repository
2. Configure MySQL in application.properties
3. Run TodoappApplication.java
4. API runs on http://localhost:9090

## API Endpoints
### TODO
- GET /todos
- GET /todos/{id}
- POST /todos
- PUT /todos/{id}
- DELETE /todos/{id}


### Auth
- POST /auth/register
- POST /auth/login

