# Item API – Spring Boot REST Application

This project is a simple Spring Boot RESTful API developed as part of a freelance Java developer sample task.
It provides basic operations to manage items using in-memory storage.

## Technology Stack

Java 17  
Spring Boot 3.2.x  
Maven  
REST API (JSON)  
Embedded Tomcat  

## Project Overview

The application allows users to:
- Add new items
- Retrieve all items
- Retrieve a single item by ID

All data is stored in memory and will reset when the application restarts.

## Project Structure

src/main/java/com/example/item/api  
ItemApiApplication.java  
controller/ItemController.java  
service/ItemService.java  
model/Item.java  

## API Endpoints

GET /items  
Returns all items  

GET /items/{id}  
Returns item by ID  

POST /items  
Adds a new item  

Content-Type: application/json  

Request Body:
{
  "name": "Laptop",
  "description": "Dell Inspiron"
}

Response:
{
  "id": 1,
  "name": "Laptop",
  "description": "Dell Inspiron"
}

## Run the Application Locally

Prerequisites:
Java 17  
Maven  

Steps:
git clone https://github.com/Brahmanpally/item-api.git  
cd item-api  
./mvnw spring-boot:run  

Application runs at:
http://localhost:8080  

## Test the APIs

Add an item (Windows PowerShell):

curl http://localhost:8080/items `
-Method POST `
-Headers @{ "Content-Type" = "application/json" } `
-Body '{ "name": "Laptop", "description": "Dell Inspiron" }'

Get all items:

curl http://localhost:8080/items -UseBasicParsing  

## Notes

This application uses in-memory storage.  
Data will reset when the application restarts.  
This project is intended for demonstration and evaluation purposes.

## Author

Brahmanpally Amulya
