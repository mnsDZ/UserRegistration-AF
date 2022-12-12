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
You can import collection or the API specifications directly into Postman.

To import the data into Postman, select Import in upper left (import Postman.lnk file).


https://www.getpostman.com/collections/914087e79c4cb1da4216

## Illustrative diagram
![Screenshot 2022-12-12 022104](https://user-images.githubusercontent.com/33765559/207098903-fc19c9a9-64cc-48d4-a722-92770e2e4d22.png)


## Technologies
Java 17
maven 3.8.0
Spring Boot 2.7.6

