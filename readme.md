# Spring Boot Assignment with JWT Implementation
This project is the Assignment for Green Stitch , it demonstrates the implementation of security using Spring Boot 3.0 and JSON Web Tokens (JWT). It includes the following features:

## Features
* User registration and login with JWT authentication
* Password encryption using BCrypt
* Role-based authorization with Spring Security
* Customized access denied handling

## Technologies
* Spring Boot 3.0
* Spring Security
* JSON Web Tokens (JWT)
* BCrypt
* Maven
 
## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+
* Maven 3+

## Prerequisites
You Need a IDE such as IntelliJ to run this code or you could use the Springboot extension for the Vscode,either way after installing running the project is very simple you need click on the Run Project button(for IntelliJ it would be in the top bar, for vs-code you need to switch to the Springboot Dashboard extension and then press the run button)

## Important Info
The file application.properties file contains most of the enviornments vairables such as the secret JWT key if you want to change it you can change it there

## Build
To build and run the project, follow these steps:

* Clone the repository: `https://github.com/IshmeetSingh06/greenstitch-assignment.git`
* Navigate to the project directory: cd greenstitch-assignment
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run 

-> The application will be available at http://localhost:5000.
