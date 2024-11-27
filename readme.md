# Standardizing API Response Structure in Spring Boot

## Description
This project demonstrates Standardizing API Response Structure in Spring Boot, as shown in the corresponding [video tutorial](https://www.youtube.com/@learnWithIfte). It provides a consistent approach to structuring REST API responses for improved clarity, scalability, and maintainability.

The repository contains the source code for implementing this standardized response structure. Follow the steps below to clone and run the project in your environment.

**Note:** I found a great article on medium on [The Best Way to Structure API Responses in Spring Boot](https://medium.com/@dulanjayasandaruwan1998/the-best-way-to-structure-api-responses-in-spring-boot-23eb6892daab) in medium. You can read that article. This project is based on that article. 
### Response Structure
The following JSON structure is used to standardize all API responses:

```json
{
  "status": "success",
  "message": "Data retrieved successfully",
  "data": {
    "id": 1,
    "name": "Dulanjaya Sandaruwan"
  },
  "metadata": {
    "page": 1,
    "size": 10,
    "total": 100
  }
}
```

#### Keys Description:
- ```status```: Indicates the result of the operation (```success``` or ```error```).
- ```message```: Provides a short, human-readable description of the result.
- ```data```: Contains the requested or manipulated resource data.
- ```metadata```: Optional. Includes additional information like pagination details when applicable.


## Getting Started
### Prerequisites
- **Java 17**
- **Spring Tool Suite (STS)**
- **Maven**

## Getting Started

### 1. Clone the Repository
To clone this project, open your terminal and run the following command:

```bash
git clone https://github.com/learnwithiftekhar/spring-boot-api-response-structure.git
```

### 2. Import the Project into Your IDE

1. Open your IDE (STS or IntelliJ IDEA).
2. Go to **File > Import > Maven > Existing Maven Projects.**
3. Browse to the folder where you cloned the repository and select it.
4. Click **Finish** to import the project. STS will build the project and download the dependencies specified in the ```pom.xml``` file.


### 3. Run the Application

1. In your IDE, right-click on the project in the Project Explorer.
2. Select **Run As > Spring Boot App**.
3. The application will start, and you’ll see the log output in the console.

### 4. Test the API Endpoints
Use a tool like Postman or cURL to test the API endpoints. The application will be available at:
http://localhost:8080

To modify the port, update the application.yml file:

```yml
server:
  port: 8081

```

### Example API Response
```json
{
  "status": "success",
  "message": "User retrieved successfully",
  "data": {
    "id": 1,
    "name": "Dulanjaya Sandaruwan"
  },
  "metadata": null
}

```
### Project Dependencies
The ``pom.xml`` file includes the following key dependencies:
- **Spring Boot Starter Web**: For building the REST API.
- **Spring Boot Starter Test**: For testing the application.

## Additional Notes
**Error Handling:** The application includes global exception handling to ensure consistent error responses.
**Extensibility:** The response structure can be extended to include additional fields like debug information or errors.

Contact
For any questions or feedback, please reach out:
- **GitHub**: [Learn with iftekhar](https://github.com/learnwithiftekhar)
- **Email**: [learnwithiftekhar@gmail.com](mailto:learnwithiftekhar@gmail.com)
