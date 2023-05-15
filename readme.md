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

## Wokring
This application as per the assignment uses jwt for authentication, the api routes are defined as:
1. /signup -> 
2. /login
I have also created routes to make use of the token to see if it actually works or not some of these are:
1. /users -> This returns the list of all the user account created inside the database
2. /users/{id} -> This returns the data of a specific users whose id is provided
3. /users/{id} -> This route also works with delete request to delete the details of the specific user

All of these routes are saved on this postman workspace : https://www.postman.com/orange-space-749343/workspace/public-workspaces/collection/22369504-d702cd1a-2b6a-4fe9-9a23-cfdddecd5d63?action=share&creator=22369504
You can run them from there as well

## Build
To build and run the project, follow these steps:

* Clone the repository: `https://github.com/IshmeetSingh06/greenstitch-assignment.git`
* Navigate to the project directory: cd greenstitch-assignment
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run 

-> The application will be available at http://localhost:5000.
