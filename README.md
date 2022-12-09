# UserRegistration-AF
User registration API develop with Spring Boot

### General Info 

A springboot API that exposes two services: 
one that allows to register a user 
one that displays the details of a registered user 


## Run application in localhost 
$ git clone https://github.com/mnsDZ/UserRegistration-AF.git
$ cd ../path/to/the/file
$ mvn clean install
$ run DemoApplication


## Endpoints 
Get all users : 
http://localhost:8080/api/v1/afUser/users 
Get one user : 
http://localhost:8080/api/v1/afUser/users/{id}
Add new user : 
http://localhost:8080/api/v1/afUser + payload


## Use postman

https://www.getpostman.com/collections/914087e79c4cb1da4216


## Technologies
Java 17
maven 3.8.1

