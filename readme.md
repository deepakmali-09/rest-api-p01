# Spring Boot Project - REST API for Person Management  

This project demonstrates the creation and use of **REST APIs** in Spring Boot. Users can add a person and retrieve all stored data using tools like **Postman** or similar API clients.  

## **Features**  
- RESTful APIs to manage person data.  
- Add a person using a POST request.  
- Retrieve all persons using a GET request.  
- Example-based learning for API development and consumption.  

## **Technologies Used**  
- **Spring Boot**: Framework for building Java-based applications.  
- **Java**: Programming language used for the implementation.  
- **Maven**: Build automation tool.  
- **Postman**: API client used for testing the endpoints.  

## **Endpoints**  

| HTTP Method | Endpoint               | Description            | Example Input (JSON)         |  
|-------------|------------------------|----------------------|--------------------------------|  
| `POST`      | `/api/create-person`   | Add a new person     | `{ "name": "", "age": 25, "city" : "" , "education" : "" , "gender": ""}` |  
| `GET`       | `/api/getPersons`      | Retrieve all persons | N/A                            |  

## **How It Works**  
1. **POST /api/create-person**:  
   - Accepts JSON data for a person (e.g., name and age) and saves it.  
2. **GET /api/getPersons**:  
   - Returns all the saved persons as a JSON array.  

## **How to Run**  
1. Clone this repository:  
   ```bash  
   git clone https://github.com/deepakmali-09/rest-api-p01.git 
